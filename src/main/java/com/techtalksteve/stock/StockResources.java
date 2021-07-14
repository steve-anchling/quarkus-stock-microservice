package com.techtalksteve.stock;

import com.techtalksteve.stock.entity.HistoricalStockEntity;
import com.techtalksteve.stock.repository.StockRepository;
import lombok.AllArgsConstructor;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/stock")
@AllArgsConstructor(onConstructor = @__(@Inject))
public class StockResources {

    private final StockRepository stockRepository;

    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public HistoricalStockEntity stocks() {
        return stockRepository.findAll().firstResult();
    }
}