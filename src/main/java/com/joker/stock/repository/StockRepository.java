package com.joker.stock.repository;

import com.joker.stock.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {

    public Stock findByStockCode(String stockCode);
}
