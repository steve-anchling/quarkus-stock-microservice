package com.techtalksteve.stock.repository;

import com.techtalksteve.stock.entity.HistoricalStockEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StockRepository implements PanacheRepository<HistoricalStockEntity> {
}