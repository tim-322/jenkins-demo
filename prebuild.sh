#!/bin/bash
rm -rf /usr/jenkins/jar/target

if [ -z "$1" ]; then
    echo "请传入需要杀死的进程名"
    exit 1
fi

# 获取传入的参数
# $1 代表第一个参数
echo "传入的参数为：$1"

# 获取pid
pid=$(pgrep "$1")

# 判断pid是否为空
if [ -z "$pid" ]; then
    echo "进程不存在"
else
    echo "杀死进程-pid:[$pid]"
    # q:kill -9和kill -15的区别
    # a:kill -9是强制杀死进程，kill -15是正常杀死进程
    kill -15 $pid
fi

# 等待一段时间，让进程有足够时间被杀死
sleep 2

# 再次检查进程状态
current_pid=$(pgrep "$1")

if [ -z "$current_pid" ]; then
    echo "进程已被杀死"
else
    echo "进程未被杀死，尝试重新杀死进程"

    # 尝试重新杀死进程
    kill -9 $current_pid

    # 再次等待一段时间
    sleep 5

    # 再次检查进程状态
    current_pid=$(pgrep "$1")

    if [ -z "$current_pid" ]; then
        echo "进程已被杀死"
    else
        echo "无法终止进程"
    fi
fi
