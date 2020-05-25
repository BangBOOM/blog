package com.wentw.blog.dao;

import com.wentw.blog.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Wenquan Yang on 2020/5/25.
 */
public interface TagRepository extends JpaRepository<Tag, Long> {

    Tag findByName(String name);

    @Query("select t from t_tag t")
    List<Tag> findTop(Pageable pageable);
}
