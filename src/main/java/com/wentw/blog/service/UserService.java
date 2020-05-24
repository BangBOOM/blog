package com.wentw.blog.service;

import com.wentw.blog.po.User;

/**
 * Created by Wenquan Yang on 2020/5/24.
 */
public interface UserService {
    User checkUser(String username, String password);
}
