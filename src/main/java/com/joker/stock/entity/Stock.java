package com.joker.stock.entity;

import com.joker.stock.dto.StockDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Stock {
    @Id
    private String uuid;
    private String stockCode;
    private String companyName;
    private String stockExchange;

    public StockDto toStockDto() {
        return StockDto.builder()
                .uuid(this.uuid)
                .companyName(this.companyName)
                .stockCode(this.stockCode)
                .stockExchange(this.stockExchange).build();
    }
}
