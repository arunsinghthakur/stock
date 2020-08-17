package com.joker.stock.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class StockDto {
    private String uuid;
    private String stockCode;
    private String companyName;
    private String stockExchange;
}