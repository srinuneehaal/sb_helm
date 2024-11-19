package com.sample.sbdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

@GetMapping("/data")
    public String getData() {

    return "This is message from Pod";
}
}
