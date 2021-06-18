package com.github.leomauricio7.EurekaCLient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EureClientService {
    @RequestMapping(value = "/available")
    public String available() {
        return "Spring in Action";
    }
}
