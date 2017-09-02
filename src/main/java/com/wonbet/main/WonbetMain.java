package com.wonbet.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.wonbet"})
public class WonbetMain {
    public static void main(String[] args){
        SpringApplication.run(WonbetMain.class);
    }

}
