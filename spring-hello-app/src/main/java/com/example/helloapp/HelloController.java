package com.example.helloapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello, World";
    }

    @GetMapping("/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello, " + name;
    }
}
