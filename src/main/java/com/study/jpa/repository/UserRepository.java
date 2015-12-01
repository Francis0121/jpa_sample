package com.study.jpa.repository;

import com.study.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by francis on 2015. 12. 2..
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
