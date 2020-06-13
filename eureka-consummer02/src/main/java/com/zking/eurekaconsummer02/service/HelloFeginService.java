package com.zking.eurekaconsummer02.service;

import com.zking.eurekaconsummer02.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Service
@FeignClient(value = "eureka-provider",fallback = FeginServiceFallBack.class)

public interface HelloFeginService {

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);

    @RequestMapping("/mapByUsername/{username}")
    public Map mapByUsername(@PathVariable("username") String username);

    @RequestMapping("/listUserByUsername/{username}")
    public User listUserByUsername(@PathVariable("username") String username);

}
