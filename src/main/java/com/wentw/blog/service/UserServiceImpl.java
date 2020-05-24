package com.wentw.blog.service;

import com.wentw.blog.dao.UserRepository;
import com.wentw.blog.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Wenquan Yang on 2020/5/24.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user=userRepository.findByUsernameAndPassword(username,password);
        return user;
    }
}
