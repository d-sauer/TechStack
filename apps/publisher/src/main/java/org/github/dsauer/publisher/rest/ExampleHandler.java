package org.github.dsauer.publisher.rest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

//@Component
public class ExampleHandler {

    public Mono<ServerResponse> hello(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello there"));
    }

    public Mono<ServerResponse> helloFurther1(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("1. Hoi there"));
    }

    public Mono<ServerResponse> helloFurther2(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("2. Ahoi there"));
    }

    public Mono<ServerResponse> helloFurther3(ServerRequest request) {
        String name = request.queryParam("name").orElse("unknown");

        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello, " + name));
    }

}
