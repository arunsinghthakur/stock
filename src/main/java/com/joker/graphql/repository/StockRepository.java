package com.joker.graphql.repository;

import com.joker.graphql.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {

    public Stock findByStockCode(String stockCode);
}
