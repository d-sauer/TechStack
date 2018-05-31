package org.github.dsauer.publisher.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Example with {@link RouterFunction}
 * @see TimeHandler
 */
//@Configuration
public class TimeRouter {

    // Bean name (routeTimeHandler) must be UNIQUE across the application
    @Bean
    public RouterFunction<ServerResponse> routeTimeHandler(TimeHandler timeHandler) {
        RouterFunction<ServerResponse> route = RouterFunctions.route(RequestPredicates.GET("/now")
                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), timeHandler::now);

        return route;
    }

}
