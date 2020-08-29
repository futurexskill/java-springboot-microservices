package com.futurex.microservices.Service2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping("/")
    public String getInfo() {
        return ("Service 2 - Payment Service");

    }
}
