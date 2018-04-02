package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wukang
 * @desc 测试
 * @methodName TestController
 * @create 2018-04-02 20:34:56
 **/
@RestController
public class TestController {
    @RequestMapping("test")
    public Object test(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",25);
        return map;
    }
}
