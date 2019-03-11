package com.interswitch.ISWOnboarding.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api")
public class Api {

    @RequestMapping(value ="" , method = GET)
    public String Greetings(){
        return  ("Hello World");
    }
}
