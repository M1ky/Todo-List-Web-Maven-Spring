package com.mike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    // hthp://localhost:8080/todo-list/hello
    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }
}
