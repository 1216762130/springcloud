package com.zking.eurekaconsummer02.controller;

import com.zking.eurekaconsummer02.model.User;
import com.zking.eurekaconsummer02.service.HelloFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Test2Controller {

    @Autowired
    private HelloFeginService helloFeginService;


    @RequestMapping("test2")
    public String test2(@RequestParam("name") String name) {

        String resp = helloFeginService.hello(name);
        return resp;
    }

    @RequestMapping(value = "/mapByUsernameTest",produces = {"application/json;charset=UTF-8"})
    public Map mapByUsername(@RequestParam("username") String username){
        Map map = helloFeginService.mapByUsername(username);

        return map;
    }

    @RequestMapping(value = "/listUserByUsernameTest",produces = {"application/json;charset=UTF-8"})
    public User listUserByUsername(@RequestParam("username") String username){
        User user = helloFeginService.listUserByUsername(username);

        return user;
    }



}
