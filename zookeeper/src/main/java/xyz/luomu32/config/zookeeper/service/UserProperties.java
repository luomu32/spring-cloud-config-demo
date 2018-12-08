package xyz.luomu32.config.zookeeper.service;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "user")
public class UserProperties {

    private boolean register;

    private int age;
}
