package com.joker.graphql.service.resolver;

import com.joker.graphql.model.StockPriceUpdate;
import com.joker.graphql.service.publisher.StockTickerRxPublisher;
import graphql.kickstart.tools.GraphQLSubscriptionResolver;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockPriceSubscriptionResolver implements GraphQLSubscriptionResolver {
    private StockTickerRxPublisher stockTickerPublisher;

    public StockPriceSubscriptionResolver(StockTickerRxPublisher stockTickerPublisher) {
        this.stockTickerPublisher = stockTickerPublisher;
    }

    Publisher<StockPriceUpdate> stockQuotes() {
        return stockTickerPublisher.getPublisher();
    }
}
