package com.futurx.microservices.CurrencyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExchangeController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("/")
    public String getExchangeRate() {
        return ("Current exchange rate from " + port);
    }
}
