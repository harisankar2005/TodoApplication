package dev.codeio.HelloWorld.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Tag(name = "Hellp World API")
@RequestMapping("/api/v1")
public class HelloWorldController {
    @GetMapping("/hello")
    String sayHelloWorld(){
        return "HelloWorld!";
    }

}
