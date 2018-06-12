package com.alan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 */
@Controller
public class HelloController {
    @Value("${userName}")
    private String userName;
    @Value("${bookTitle}")
    private String bookTitle;

    @RequestMapping("/hello")
    public String hello(ModelMap map){
        System.out.println("hello in...");
        map.addAttribute("name",userName);
        map.addAttribute("bookTitle",bookTitle);
        return "welcome";
    }
}
