package com.bridgelabz.Api_Testing1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiCtrl
{
    @GetMapping("/greet")
    public String greet()
    {
        return "hello world";
    }
}
