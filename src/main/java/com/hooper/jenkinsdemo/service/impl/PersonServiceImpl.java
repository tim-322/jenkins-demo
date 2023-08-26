package com.hooper.jenkinsdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hooper.jenkinsdemo.domain.Person;
import com.hooper.jenkinsdemo.service.PersonService;
import com.hooper.jenkinsdemo.mapper.PersonMapper;
import org.springframework.stereotype.Service;

/**
* @author felix
* @description 针对表【tb_person】的数据库操作Service实现
* @createDate 2023-08-26 11:51:44
*/
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person>
    implements PersonService{

}




