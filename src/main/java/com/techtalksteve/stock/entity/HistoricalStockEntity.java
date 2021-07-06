package com.techtalksteve.stock.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Currency;

@Entity(name = "HISTORICAL_STOCK")
@Data
public class HistoricalStockEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String symbol;
    private Currency currency;
    @Column
    private OffsetDateTime date;
    private BigDecimal open;
    private BigDecimal low;
    private BigDecimal high;
    private BigDecimal close;
}
