package xyz.luomu32.config.zookeeper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.luomu32.config.zookeeper.entity.User;
import xyz.luomu32.config.zookeeper.repo.UserRepo;
import xyz.luomu32.config.zookeeper.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User findById(@PathVariable Long id) {
        return userRepo.findById(id).orElse(null);
    }


    @GetMapping("test")
    public void test() {
        userService.testVersion();
    }

}
