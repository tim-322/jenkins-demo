package com.hooper.jenkinsdemo.mapper;

import com.hooper.jenkinsdemo.domain.Person;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author felix
* @description 针对表【tb_person】的数据库操作Mapper
* @createDate 2023-08-26 11:51:44
* @Entity com.hooper.jenkinsdemo.domain.Person
*/
@Mapper
public interface PersonMapper extends BaseMapper<Person> {

}




