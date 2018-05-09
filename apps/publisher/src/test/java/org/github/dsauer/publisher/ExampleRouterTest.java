package org.github.dsauer.publisher;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

@ExtendWith(SpringExtension.class)
@WebFluxTest
@Tag("webflux")
@DisplayName("Example endpoints")
@ContextConfiguration(classes = {ExampleRouter.class, ExampleHandler.class})
class ExampleRouterTest {

    @Autowired
    private WebTestClient webClient;

    @Test
    @DisplayName("/exampleFurther3?name=Davor")
    public void nowRoute() {
        webClient.get()
                .uri("/exampleFurther3?name=Davor")
                .accept(MediaType.TEXT_PLAIN)
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("Hello, Davor");
    }

    @Test
    @DisplayName("Not found endpoint")
    public void notFound() {
        webClient
                .get().uri("/example/something")
                .accept(MediaType.TEXT_PLAIN)
                .exchange()
                .expectStatus().isNotFound();
    }

}