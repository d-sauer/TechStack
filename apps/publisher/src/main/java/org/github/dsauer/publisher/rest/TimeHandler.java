package org.github.dsauer.publisher.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.time.LocalDateTime;

import reactor.core.publisher.Mono;

//@Component
public class TimeHandler {

    private static final Logger logger = LoggerFactory.getLogger(TimeHandler.class);

    public Mono<ServerResponse> now(ServerRequest request) {
        logger.debug("{} {}", request.methodName(), request.uri());

        LocalDateTime currentTime = LocalDateTime.now();

        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Current time: " + currentTime.toString()));
    }
}
