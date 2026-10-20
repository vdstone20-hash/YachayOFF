package com.yachayoff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
    "com.yachayoff",
    "config",
    "controller",
    "dto",
    "entity",
    "enums",
    "exception",
    "repository",
    "service"
})
@EntityScan(basePackages = {
    "entity",
    "com.yachayoff.entity"
})
@EnableJpaRepositories(basePackages = {
    "repository",
    "com.yachayoff.repository"
})
public class YachayOffApplication {

    public static void main(String[] args) {
        SpringApplication.run(YachayOffApplication.class, args);
    }
}