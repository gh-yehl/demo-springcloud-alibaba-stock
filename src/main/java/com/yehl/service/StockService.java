package com.yehl.service;

import com.yehl.domain.Stock;
import com.yehl.repository.StockRepository;
import com.yehl.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    StockRepository stockRepository;

    public String updateStock() {
        Stock stock = new Stock();
        stock.setId(1);
        stock.setLineNum(1);
        stock.setAmount(CommonUtils.generateInt());

        stock = stockRepository.save(stock);
        return "仓储库存 数量 -1 成功!!!";
    }
}
