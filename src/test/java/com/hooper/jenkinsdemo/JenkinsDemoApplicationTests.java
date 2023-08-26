package com.hooper.jenkinsdemo;

import com.hooper.jenkinsdemo.domain.Person;
import com.hooper.jenkinsdemo.service.PersonService;
import com.hooper.jenkinsdemo.util.ColorUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@Slf4j
class JenkinsDemoApplicationTests {

    @Resource
    private PersonService personService;
    @Test
    void contextLoads() {
        log.info("测试JenkinsDemoApplicationTests...");
        List<Person> personList = personService.list();
        log.info("获取personService的list()方法的返回值条数:{}", personList.size());
        Assertions.assertNotNull(personList);
        personList.forEach(person -> {
            String printStr = ColorUtil.getColorString(person.toString(), "yellow");
            log.info("person:{}", printStr);
        });
        log.info("测试JenkinsDemoApplicationTests成功!");
    }



}
