package xyz.luomu32.spring.cloud.config.demo.consul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ConsulApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .profiles("prod")
                .sources(ConsulApp.class)
                .run(args);
    }
}
