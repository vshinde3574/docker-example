package com.dockerexample.dockerexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestResource {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Docker";
    }
}
