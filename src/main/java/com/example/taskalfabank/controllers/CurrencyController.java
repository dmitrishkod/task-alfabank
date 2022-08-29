package com.example.taskalfabank.controllers;

import com.example.taskalfabank.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Currency;
import java.util.List;

@RestController
@RequestMapping("city")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    /**
     * Получение списка городов типа City
     *
     * @return
     */
    @GetMapping(path = "/", produces = "application/json")
    public List<Currency> getCurrency() {
        return currencyService.list();
    }
}