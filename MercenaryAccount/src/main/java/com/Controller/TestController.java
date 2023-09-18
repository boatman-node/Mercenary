package com.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/Test/{Name}")
    String SystemTest(@PathVariable String Name){
          return Name;
    }
}
