package com.wentw.blog.util;


import static org.springframework.util.DigestUtils.md5DigestAsHex;

/**
 * Created by Wenquan Yang on 2020/5/26.
 * 这部分是用来设置密码的因为前端没有设置注册页面，用户需要手动从数据库添加，由于等都使用了md5加密的密码所以这里是对密码进行了转换
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(md5DigestAsHex("".getBytes()));
    }
}
