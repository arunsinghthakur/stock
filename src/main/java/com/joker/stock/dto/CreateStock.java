package com.joker.stock.dto;

import com.joker.stock.entity.Stock;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class CreateStock {
    private String stockCode;
    private String companyName;
    private String stockExchange;

    public Stock toStock() {
        return Stock.builder()
                .uuid(UUID.randomUUID().toString())
                .stockCode(this.stockCode)
                .stockExchange(this.stockExchange)
                .companyName(this.companyName)
                .build();
    }
}