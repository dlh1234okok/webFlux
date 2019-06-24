package com.spring5.demo.controller;

import com.spring5.demo.generator.PersonGenerator;
import com.spring5.demo.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author: dulihong
 * @date: 2019/1/21 13:53
 */
@RestController
public class HelloController {

    @Autowired
    private PersonGenerator personGenerator;

    @GetMapping("/hello")
    public Flux<Person> getPerson() {
        System.out.println("reactive start...");
        Flux<Person> flux = personGenerator.createPerson();
        System.out.println("reactive end...");
        return flux;
    }


}
