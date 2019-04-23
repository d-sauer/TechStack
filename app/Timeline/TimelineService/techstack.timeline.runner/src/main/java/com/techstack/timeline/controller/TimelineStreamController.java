package com.techstack.timeline.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.UUID;

@Controller
//@RequestMapping("${openapi.timelineService.base-path:/services/techstack/timeline/v1}")
@RequestMapping
public class TimelineStreamController {


//    @ApiOperation(value = "Get last 10 timeline events for a user", nickname = "getUserTimelineStream", notes = "", response = TimelineEvent.class, responseContainer = "List", tags={  })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Timeline events", response = TimelineEvent.class, responseContainer = "List"),
//            @ApiResponse(code = 401, message = "User is not authorized to access a timeline"),
//            @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @GetMapping(value = "/timeline-stream",
            produces = {MediaType.APPLICATION_STREAM_JSON_VALUE})
    /**
     * curl -i localhost:8080/timeline-stream
     */
    public Flux<String> timelineStream() {
        return Flux.interval(Duration.ofMillis(1500))
                .map(l ->
                        UUID.randomUUID().toString()
                ).log();
    }
}
