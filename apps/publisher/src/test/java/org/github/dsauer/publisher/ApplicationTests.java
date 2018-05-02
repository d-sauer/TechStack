package org.github.dsauer.publisher;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Tag("integration")
@DisplayName("Application context")
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ApplicationTests {

    @Test
    @DisplayName("Verify that application context is starting")
	public void contextLoads() {
	}

}
