package com.techstack.timeline.restapi.api;

import com.techstack.timeline.restapi.model.Error;
import com.techstack.timeline.restapi.model.TimelineEvent;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link TimelineApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-23T08:12:28.883123+02:00[Europe/Amsterdam]")

public interface TimelineApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * @see TimelineApi#getUserTimeline
     */
    default Mono<ResponseEntity<Flux<TimelineEvent>>> getUserTimeline(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                result = ApiUtil.getExampleResponse(exchange, "{  \"date\" : \"2000-01-23T04:56:07.000+00:00\",  \"metadata\" : {    \"originId\" : \"originId\",    \"origin\" : \"origin\"  },  \"category\" : \"category\",  \"uuid\" : \"uuid\",  \"status\" : \"pending\"}");
                break;
            }
        }
        return result.then(Mono.empty());

    }

}
