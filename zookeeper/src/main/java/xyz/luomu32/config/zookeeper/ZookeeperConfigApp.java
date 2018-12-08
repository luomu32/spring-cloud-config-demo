package xyz.luomu32.config.zookeeper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ZookeeperConfigApp {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String getConfig(@RequestParam String name) {
        return environment.getProperty(name);
    }

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperConfigApp.class, args);
    }
}
