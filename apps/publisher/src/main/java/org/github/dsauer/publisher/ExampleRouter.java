package org.github.dsauer.publisher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.TEXT_PLAIN;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class ExampleRouter {

    @Bean
    public RouterFunction<ServerResponse> routeExampleHello(ExampleHandler exampleHandler) {
        RouterFunction<ServerResponse> route = RouterFunctions
                .route(GET("/example")
                        .and(accept(TEXT_PLAIN)), exampleHandler::hello);

        return route;
    }

    @Bean
    public RouterFunction<ServerResponse> routeExampleOneStepFurther(ExampleHandler exampleHandler) {
        RouterFunction<ServerResponse> route = RouterFunctions
                .route(GET("/exampleFurther1").and(accept(TEXT_PLAIN)), exampleHandler::helloFurther1)
                .andRoute(GET("/exampleFurther2").and(accept(TEXT_PLAIN)), exampleHandler::helloFurther2)
                .andRoute(GET("/exampleFurther3").and(accept(TEXT_PLAIN)), exampleHandler::helloFurther3);

        return route;
    }

}
