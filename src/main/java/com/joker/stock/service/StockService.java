package com.joker.stock.service;

import com.joker.stock.dto.*;
import com.joker.stock.entity.Stock;
import com.joker.stock.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public StockDto addStock(CreateStock stock) {
        return stockRepository.save(stock.toStock()).toStockDto();
    }

    public StockDto updateStock(UpdateStock stock) {
        return stockRepository.saveAndFlush(stock.toStock()).toStockDto();
    }

    public StockDto getStock(GetStock stock) {
        Stock s = stockRepository.findByStockCode(stock.getStockCode());
        return s != null ? s.toStockDto() : null;
    }

    public void deleteStock(DeleteStock stock) {
        Stock s = stockRepository.findByStockCode(stock.getStockCode());
        if (s != null) {
            stockRepository.delete(s);
        }
    }

    public List<StockDto> getAllStocks() {
        return stockRepository.findAll().stream().map(s -> s.toStockDto()).collect(Collectors.toList());
    }

}
