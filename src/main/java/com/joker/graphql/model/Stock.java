package com.joker.graphql.model;

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

}
