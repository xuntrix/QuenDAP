package com.quendap.quendap.controller;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class QuendapRestController {
 
    @GetMapping(value = "/hello")
    String hello() {
        return "It works!";
    }
 
}