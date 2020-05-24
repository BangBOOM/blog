package com.wentw.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Wenquan Yang on 2020/5/24.
 */
@Controller
@RequestMapping("/admin")
public class BlogController {

    @GetMapping("/blogs")
    public String blogs(){
        return "admin/blogs";
    }

}
