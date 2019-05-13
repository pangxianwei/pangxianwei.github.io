package com.alittle.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asin")
public class AsinGetController {
    @GetMapping("/getAsin")
    public String addAsin(String date,String asin){
        System.out.println(date);
        System.out.println(asin);
        return "ok";
    }
}
