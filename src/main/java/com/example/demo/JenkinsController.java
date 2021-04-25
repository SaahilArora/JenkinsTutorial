package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("/getDetails")
    public String getUserName(){return "Hi User, I'm Alive live streaming started on Dev .";}
}
