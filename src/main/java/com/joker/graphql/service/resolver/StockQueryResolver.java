package com.joker.graphql.service.resolver;

import com.joker.graphql.model.Stock;
import com.joker.graphql.service.StockService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockQueryResolver implements GraphQLQueryResolver {
    @Autowired
    private StockService stockService;

    public List<Stock> findAllStocks() {
        return stockService.getAllStocks();
    }

    public Stock findStockByStockCode(String stockCode) {return stockService.findByStockCode(stockCode);}
}
