package com.wentw.blog.dao;

import com.wentw.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Wenquan Yang on 2020/5/24.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String usename,String passowrd);
}
