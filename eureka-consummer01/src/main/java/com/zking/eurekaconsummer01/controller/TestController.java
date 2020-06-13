package com.zking.eurekaconsummer01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test1")
    public String test1(@RequestParam("name") String name){
       String url = "http://localhost:7201/hello/"+name;

        String resp = restTemplate.getForObject(url, String.class);

        return resp;
    }


}
