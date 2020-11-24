package com.example.gcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(GcloudApplication.class, args);
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }

}
