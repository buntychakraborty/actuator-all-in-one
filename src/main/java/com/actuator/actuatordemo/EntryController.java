package com.actuator.actuatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {
    @GetMapping("/hello")
    public String get() {
        return "Hello";
    }
}
