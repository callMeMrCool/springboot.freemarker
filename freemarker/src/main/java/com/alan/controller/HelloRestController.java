package com.alan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
@RestController
public class HelloRestController {

    @RequestMapping("/book")
    @ResponseBody
    public Map book(String name){
        System.out.println("bookname = " + name);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name",name);
        return map;
    }
}
