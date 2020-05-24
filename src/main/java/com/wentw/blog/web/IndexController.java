package com.wentw.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Wenquan Yang on 2020/5/24.
 */
@Controller
public class IndexController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    @GetMapping("/types")
    public String types() {
        return "types";
    }

    @GetMapping("/tags")
    public String tags() {
        return "tags";
    }
    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/archives")
    public String archives() {
        return "archives";
    }

}
