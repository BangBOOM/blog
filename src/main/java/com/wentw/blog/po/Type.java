package com.wentw.blog.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wenquan Yang on 2020/5/24.
 */

@Entity(name = "t_type")
@Table
public class Type {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    @OneToMany(mappedBy = "type")
    private List<Blog> blogs=new ArrayList<>();

    public Type() {
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
