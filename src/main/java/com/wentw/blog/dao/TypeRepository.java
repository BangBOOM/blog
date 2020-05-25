package com.wentw.blog.dao;

import com.wentw.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

/**
 * Created by Wenquan Yang on 2020/5/24.
 */
public interface TypeRepository extends JpaRepository<Type,Long> {
    Type findByName(String name);

    @Query("select t from t_type t")
    List<Type> findTop(Pageable pageable);
}
