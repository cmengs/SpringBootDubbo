package cn.m.service;

import cn.m.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public User saveUser(User user) {
        user.setId(1);
        return user;
    }
}
