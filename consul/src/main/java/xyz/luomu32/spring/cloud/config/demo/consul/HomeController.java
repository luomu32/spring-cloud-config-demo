package xyz.luomu32.spring.cloud.config.demo.consul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private Environment environment;

    @GetMapping("{key}")
    public String index(@PathVariable String key) {

        return environment.getProperty(key);
    }

    @GetMapping("profile/{profile}")
    public boolean profile(@PathVariable String profile) {
        for (String activeProfile : environment.getActiveProfiles()) {
            System.out.println("active profile: " + activeProfile);
        }

        for (String defaultProfile : environment.getDefaultProfiles()) {
            System.out.println("default profile: " + defaultProfile);
        }

        return environment.acceptsProfiles(profile);
    }
}
