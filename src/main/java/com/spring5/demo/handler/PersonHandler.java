package com.spring5.demo.handler;

import com.spring5.demo.generator.PersonGenerator;
import com.spring5.demo.po.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.*;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * @author: dulihong
 * @date: 2019/1/21 10:16
 */
@Configuration
public class PersonHandler {

    private final Flux<Person> persons;

    public PersonHandler(PersonGenerator personGenerator) {
        this.persons = personGenerator.createPerson();
    }

    public Mono<ServerResponse> hello(ServerRequest request) {
        return ok().contentType(TEXT_PLAIN)
                .body(BodyInserters.fromObject("hello Spring"));
    }

    public Mono<ServerResponse> echo(ServerRequest request) {
        return ok().contentType(APPLICATION_JSON)
                .body(this.persons, Person.class);
    }

}
