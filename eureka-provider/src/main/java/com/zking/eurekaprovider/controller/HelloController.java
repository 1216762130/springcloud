package com.zking.eurekaprovider.controller;

import com.zking.eurekaprovider.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {


    @Value("${server.port}")
    private Integer port;

    @Value("${config.hello}")
    private String msg;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return name+"端口号："+port+"msg:"+msg;
    }


    @RequestMapping("/mapByUsername/{username}")
    public Map mapByUsername(@PathVariable("username") String username) {
        Map map = new HashMap();
        map.put("code",1);
        map.put("username",username);

        return map;
    }

    @RequestMapping(value = "/listUserByUsername/{username}",produces = {"application/json;charset=UTF-8"})
    public User listUserByUsername(@PathVariable("username") String username) {
       User user = new User();
       user.setUsername("zs");
       user.setPassword("123");

        return user;
    }

}
