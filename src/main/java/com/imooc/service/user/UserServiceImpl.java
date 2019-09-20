package com.imooc.service.user;

import com.imooc.entity.User;
import com.imooc.repository.UserRepository;
import com.imooc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository repository;
    @Override
    public User findUserByName(String name) {
        return repository.findUserByName();
    }
}
