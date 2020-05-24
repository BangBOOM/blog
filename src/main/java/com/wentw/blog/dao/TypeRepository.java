package com.wentw.blog.dao;

import com.wentw.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Wenquan Yang on 2020/5/24.
 */
public interface TypeRepository extends JpaRepository<Type,Long> {
}
