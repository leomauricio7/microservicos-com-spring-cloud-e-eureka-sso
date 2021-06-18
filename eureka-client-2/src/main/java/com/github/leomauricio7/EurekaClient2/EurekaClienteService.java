package com.github.leomauricio7.EurekaClient2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClienteService {
    @RequestMapping(value = "/client2/available")
    public String available() {
        return "Spring in Action Cliente 2";
    }
}
