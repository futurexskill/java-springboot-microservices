package com.futurex.microservices.FXOrderService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope

public class OrderController {

    @Value(("${organization.name}"))
    private String organizationName;

    @Value(("${service.welcome.message}"))
    private String serviceMessage;

    @RequestMapping("/")
    public String getOrder() {
        return(organizationName+"***"+serviceMessage);
    }
}
