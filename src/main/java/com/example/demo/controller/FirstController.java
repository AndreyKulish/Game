package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hitek on 12.06.2017.
 */
@RestController
public class FirstController {

    @RequestMapping("/")
    public String getListOfCustomers() {
        return "hello";
    }

}
