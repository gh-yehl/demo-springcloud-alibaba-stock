package com.yehl.controller;

import com.yehl.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    StockService stockService;

    @GetMapping(value = "updateStock")
    public String updateStock() {
        String updateResponse = stockService.updateStock();
        System.out.println(updateResponse);
        return updateResponse + "--------> From Stock Controller";
    }
}
