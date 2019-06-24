package com.spring5.demo.generator;

import com.spring5.demo.po.Person;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: dulihong
 * @date: 2019/1/21 10:19
 */
@Configuration
public class PersonGenerator {

    public Flux<Person> createPerson() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("1", "zs", "123"));
        people.add(new Person("2", "ls", "234"));
        people.add(new Person("3", "ww", "345"));
        return Flux.fromIterable(people);
    }

}
