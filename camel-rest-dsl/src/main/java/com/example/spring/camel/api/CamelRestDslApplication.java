package com.example.spring.camel.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * A spring-boot application that includes a Camel route builder to setup the Camel routes
 */
@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class CamelRestDslApplication {

    // must have a main method spring-boot can run
    public static void main(String[] args) {
        SpringApplication.run(CamelRestDslApplication.class, args);
    }

}
