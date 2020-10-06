package com.actuator.actuatordemo;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "rest-end-point")
public class MyOwnControllerEndPoint {
    @GetMapping("/custom")
    public String getRestEnd(){
        return "Hello from rest controller end point";

    }
}
