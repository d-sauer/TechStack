package com.techstack.timeline.controller;

import com.techstack.timeline.restapi.api.TimelineApiDelegate;
import com.techstack.timeline.restapi.model.TimelineEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.UUID;

@Controller
public class TimelineController implements TimelineApiDelegate {

    @Override
    public Mono<ResponseEntity<Flux<TimelineEvent>>> getUserTimeline(ServerWebExchange exchange) {

        var events = new ArrayList<TimelineEvent>();
        for(int n = 0; n<10; n++) {
            events.add(new TimelineEvent()
                            .uuid(UUID.randomUUID().toString())
                            .date(LocalDateTime.now().atOffset(ZoneOffset.UTC))
                            .category("fuel")
                      );
        }

        return Mono.just(new ResponseEntity(Flux.just(events), HttpStatus.OK));
    }
}
