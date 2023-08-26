package com.hooper.jenkinsdemo.controller;

import com.hooper.jenkinsdemo.domain.Person;
import com.hooper.jenkinsdemo.service.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Resource
    private PersonService personService;

    //查询列表
    @RequestMapping("/list")
    public List<Person> list(){
        return personService.list();
    }
}
