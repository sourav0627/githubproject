package com.csi.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String sayHello()
    {
        return "Welcome to CSI";
    }
    @GetMapping("/add")
    public String sayAddress()
    {
        return "PUNE";
    }
}
