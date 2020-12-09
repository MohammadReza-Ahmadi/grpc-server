package com.vosouq.grpcdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class HelloController {

    @GetMapping(value = "/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
