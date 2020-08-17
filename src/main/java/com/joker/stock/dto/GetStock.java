package com.joker.stock.dto;

import com.joker.stock.entity.Stock;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class GetStock {
    private String stockCode;
}