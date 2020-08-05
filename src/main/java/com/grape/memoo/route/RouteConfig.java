package com.grape.memoo.route;

import com.grape.memoo.handler.UserHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@RequiredArgsConstructor
public class RouteConfig {
    private final UserHandler userHandler;

    @Bean
    RouterFunction<ServerResponse> routes() {
        return route(POST("/user"), userHandler::saveUser)
                .andRoute(GET("/user/{id}"), userHandler::getUserById);
//                        .andRoute(GET("/person").and(accept(APPLICATION_JSON)), handler::listPeople)
//                        .andRoute(POST("/person").and(contentType(APPLICATION_JSON)), handler::createPerson);
    }
}
