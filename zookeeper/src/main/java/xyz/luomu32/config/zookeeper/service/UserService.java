package xyz.luomu32.config.zookeeper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
@EnableConfigurationProperties(UserProperties.class)
public class UserService {

    @Value("${version}")
    private String version;

//    @Autowired
//    private Environment environment;
//
//    @Autowired
//    private UserProperties userProperties;
//
    public void testVersion() {
        System.out.println(version);
//        System.out.println(environment.getProperty("version"));
//        System.out.println("---------");
//        System.out.println(userProperties);
    }

}
