package com.study.jpa.repository;

import com.study.jpa.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by francis on 2015. 12. 1..
 */
public interface ParentRepository extends JpaRepository<Parent, Long> {
}
