package org.github.dsauer.publisher;

import org.github.dsauer.publisher.rest.TimeHandler;
import org.github.dsauer.publisher.rest.TimeRouter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.platform.commons.util.StringUtils.isNotBlank;

@ExtendWith(SpringExtension.class)
@WebFluxTest
@Tag("webflux")
@DisplayName("Time endpoints")
@ContextConfiguration(classes = {TimeRouter.class, TimeHandler.class})
class TimeRouterTest {

    @Autowired
    private WebTestClient webClient;

    @Test
    @DisplayName("/now endpoint")
    public void nowRoute() {
        webClient.get()
                .uri("/now")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .consumeWith(m -> assertTrue(isNotBlank(new String(m.getResponseBodyContent(), StandardCharsets.UTF_8))));
    }

}