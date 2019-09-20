package com.imooc.repository;

import com.imooc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findUserByName(String username);

}
