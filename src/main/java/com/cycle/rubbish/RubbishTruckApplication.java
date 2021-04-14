package com.cycle.rubbish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.cycle.rubbish.web.servlet")
public class RubbishTruckApplication {

    public static void main(String[] args) {
        SpringApplication.run(RubbishTruckApplication.class, args);
    }

}