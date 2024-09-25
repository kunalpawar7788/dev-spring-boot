package com.kunal.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello Kunal!";
    }

    @GetMapping("/workout")
    public String checkWorkout() {
        return "Run hard 5k";
    }

    @GetMapping("/all")
    public String all() {
        return "All in one";
    }
}
