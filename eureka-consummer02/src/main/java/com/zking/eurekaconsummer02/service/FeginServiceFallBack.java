package com.zking.eurekaconsummer02.service;

import com.zking.eurekaconsummer02.model.User;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class FeginServiceFallBack implements HelloFeginService{

    @Override
    public String hello(String name) {
        return "系统繁忙！";
    }

    @Override
    public Map mapByUsername(String username) {
        return null;
    }

    @Override
    public User listUserByUsername(String username) {
        return null;
    }
}
