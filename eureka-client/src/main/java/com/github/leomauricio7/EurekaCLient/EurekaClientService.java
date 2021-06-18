package com.github.leomauricio7.EurekaCLient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientService {
    @RequestMapping(value = "/client1//available")
    public String available() {
        return "Spring in Action Cliente 1";
    }
}
