package com.example.microservicetwoclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class ControllerBasic {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/helloTwo")

    public String get(){

        String Str = restTemplate.getForObject("http://localhost:9091"+"/hello",String.class);
        return Str+"->microservice-two";
    }
}
