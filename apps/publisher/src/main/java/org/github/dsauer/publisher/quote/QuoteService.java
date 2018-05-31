package org.github.dsauer.publisher.quote;

import java.util.stream.Stream;

public interface QuoteService {

    boolean addQuote(Quote quote);

    Stream<Quote> get();

    Quote getRandomQuote();

}
