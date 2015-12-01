package com.study.jpa.service;

import com.study.jpa.config.RootApplication;
import com.study.jpa.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by francis on 2015. 12. 2..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootApplication.class)
public class UserServiceTest {

    private @Autowired UserService userService;

    @Test
    public void testSave(){
        User user = new User();
        user.setName("User");
        user = userService.save(user);
        System.out.println(user);
    }
}
