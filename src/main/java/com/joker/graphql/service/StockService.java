package com.joker.graphql.service;

import com.joker.graphql.model.Stock;
import com.joker.graphql.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public Stock addStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Stock findByStockCode(String stockCode) {
        return stockRepository.findByStockCode(stockCode);
    }
}
