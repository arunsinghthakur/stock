package com.joker.stock.dto;

import com.joker.stock.entity.Stock;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class UpdateStock {
    private String uuid;
    private String stockCode;
    private String companyName;
    private String stockExchange;

    public Stock toStock() {
        return Stock.builder()
                .uuid(this.uuid)
                .stockCode(this.stockCode)
                .stockExchange(this.stockExchange)
                .companyName(this.companyName)
                .build();
    }
}