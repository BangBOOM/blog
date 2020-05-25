package com.wentw.blog.dao;

import com.wentw.blog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Wenquan Yang on 2020/5/25.
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);
}
