package com.softcare.jenkinsdocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsDockeroneApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDockeroneApplication.class);

    @GetMapping
    public String run() {
        return "Running Jenkins With Docker !!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringJenkinsDockeroneApplication.class, args);
    }

}
