package org.github.dsauer.publisher.quote;


import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class QuoteServiceImpl  implements QuoteService {

    private List<Quote> quotes;

    public QuoteServiceImpl(List<Quote> quotes) {
        this.quotes = quotes;
    }

    @Override
    public boolean addQuote(Quote quote) {
        return quotes.add(quote);
    }

    @Override
    public Stream<Quote> get() {
        return this.quotes.stream();
    }

    @Override
    public Quote getRandomQuote() {
        Random rand = new Random();
        int index = rand.ints(1, this.quotes.size()).findFirst().getAsInt();
        quotes.get(index);
        return null;
    }
}
