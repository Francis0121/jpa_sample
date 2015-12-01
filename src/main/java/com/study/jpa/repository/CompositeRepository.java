package com.study.jpa.repository;

import com.study.jpa.entity.Composite;
import com.study.jpa.entity.CompositePk;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by francis on 2015. 12. 2..
 */
public interface CompositeRepository extends JpaRepository<Composite, CompositePk> {
}
