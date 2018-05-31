package org.github.dsauer.publisher;

import org.github.dsauer.publisher.configuration.StaticQuoteProperties;
import org.github.dsauer.publisher.quote.Quote;
import org.github.dsauer.publisher.quote.QuoteService;
import org.github.dsauer.publisher.quote.QuoteServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(StaticQuoteProperties.class)
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @Bean
	public QuoteService quoteService(StaticQuoteProperties staticQuoteProperties) {
	    logger.info("{}", staticQuoteProperties);

        List<Quote> quotes = new ArrayList<>();
	    return new QuoteServiceImpl(quotes);
    }
}
