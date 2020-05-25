package com.wentw.blog.util;


import static org.springframework.util.DigestUtils.md5DigestAsHex;

/**
 * Created by Wenquan Yang on 2020/5/26.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(md5DigestAsHex("2^10-3ywq".getBytes()));
    }
}
