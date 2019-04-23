package com.techstack.timeline.restapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-23T08:12:28.883123+02:00[Europe/Amsterdam]")

@Controller
@RequestMapping("${openapi.timelineService.base-path:/services/techstack/timeline/v1}")
public class TimelineApiController implements TimelineApi {

    private final TimelineApiDelegate delegate;

    public TimelineApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) TimelineApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new TimelineApiDelegate() {});
    }

    @Override
    public TimelineApiDelegate getDelegate() {
        return delegate;
    }

}
