package com.futurx.microservices.CurrencyApp;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient client;

    @RequestMapping("/")
    public String getCurrencyValue() {

        restTemplate = getRestTemplate();

        InstanceInfo instanceInfo = client.getNextServerFromEureka("currency-service",false);
        String currencyExchangeURL = instanceInfo.getHomePageUrl();
        String exchangeMessage = restTemplate.getForObject(currencyExchangeURL,String.class);

        return ("Exchange value is "+exchangeMessage);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
