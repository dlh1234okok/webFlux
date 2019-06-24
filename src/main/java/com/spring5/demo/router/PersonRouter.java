package com.spring5.demo.router;

import com.spring5.demo.handler.PersonHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

/**
 * @author: dulihong
 * @date: 2019/1/21 10:30
 */
@Configuration
public class PersonRouter {

    @Bean
    public RouterFunction<ServerResponse> router(PersonHandler personHandler) {
        return RouterFunctions.route(RequestPredicates.GET("/p")
                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), personHandler::hello)
                .andRoute(RequestPredicates.GET("/person")
                        .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), personHandler::echo);
    }

}
