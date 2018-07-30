package com.dhis.hrhis.TestControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestIndex {

    @RequestMapping("/")
    public String index(){
        return "Hello, Eliah";
    }
}
