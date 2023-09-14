package edu.codeup.codeupspringblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello/word")
    @ResponseBody
    public String helloWorld() {
        return "hello world";
    }


}