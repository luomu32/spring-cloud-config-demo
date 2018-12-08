package xyz.luomu32.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private Environment environment;


    @GetMapping("git")
    public String getFromGit(@RequestParam String name) {

        return environment.getProperty(name);
    }

}
