package com.wentw.blog.web;

import com.wentw.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Wenquan Yang on 2020/5/25.
 */
@Controller
public class ArchiveShowController {

    @Autowired
    BlogService blogService;

    @GetMapping("archives")
    public String archives(Model model) {
        model.addAttribute("archiveMap", blogService.archiveBlog());
        model.addAttribute("blogCount", blogService.countBlog());
        return "archives";
    }

}
