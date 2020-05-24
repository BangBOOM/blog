package com.wentw.blog.util;

import org.springframework.util.DigestUtils;

/**
 * Created by Wenquan Yang on 2020/5/24.
 */
public class Demo {
    public static void main(String[] args) {
        String password="admin";
        String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
        System.out.println(md5Password);
    }
}
