package com.joker.graphql.service.resolver;

import com.joker.graphql.model.Stock;
import com.joker.graphql.model.StockInput;
import com.joker.graphql.service.StockService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StockMutationResolver implements GraphQLMutationResolver {
    @Autowired
    private StockService stockService;

    public Stock addStock(StockInput stockInput) {
        return stockService.addStock(stockInput.toStock());
    }
}
