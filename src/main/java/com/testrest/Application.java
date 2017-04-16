package com.testrest;

import com.testrest.config.JpaConfig;
import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@EnableJSONDoc
@Import(JpaConfig.class)
@SpringBootApplication(scanBasePackages = "com.testrest")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
