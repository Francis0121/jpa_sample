package com.study.jpa.service;

import com.study.jpa.entity.User;
import com.study.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by francis on 2015. 12. 2..
 */
@Service
public class UserService {

	private @Autowired UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

}
