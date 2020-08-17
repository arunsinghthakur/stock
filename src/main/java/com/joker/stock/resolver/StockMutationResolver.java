package com.joker.stock.resolver;

import com.joker.stock.dto.CreateStock;
import com.joker.stock.dto.DeleteStock;
import com.joker.stock.dto.StockDto;
import com.joker.stock.dto.UpdateStock;
import com.joker.stock.service.StockService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StockMutationResolver implements GraphQLMutationResolver {
    @Autowired
    private StockService stockService;

    public StockDto addStock(CreateStock stock) {
        return stockService.addStock(stock);
    }

    public StockDto updateStock(UpdateStock stock) {
        return stockService.updateStock(stock);
    }

    public String deleteStock(DeleteStock stock) {
         stockService.deleteStock(stock);
         return "Success";
    }
}
