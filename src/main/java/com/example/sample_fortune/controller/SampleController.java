package com.example.sample_fortune.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class SampleController {
    @GetMapping("/")
    public String sample() {
        return "sample";
    }
}
