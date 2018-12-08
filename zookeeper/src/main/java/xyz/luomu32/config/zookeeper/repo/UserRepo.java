package xyz.luomu32.config.zookeeper.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.luomu32.config.zookeeper.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
