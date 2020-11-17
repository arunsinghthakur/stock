package com.joker.stock.resolver;

import com.joker.stock.dto.StockPriceUpdate;
import com.joker.stock.service.StockTickerRxPublisher;
import graphql.kickstart.tools.GraphQLSubscriptionResolver;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;

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
