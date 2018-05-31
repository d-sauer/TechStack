package org.github.dsauer.publisher.configuration;

import org.github.dsauer.publisher.quote.Quote;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties
@PropertySource("classpath:quotes.yml")
public class StaticQuoteProperties {

    private List<Quote> quotes = new ArrayList<>();

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }
}
