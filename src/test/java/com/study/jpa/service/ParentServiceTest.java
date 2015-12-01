package com.study.jpa.service;

import com.study.jpa.config.RootApplication;
import com.study.jpa.entity.Parent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by francis on 2015. 12. 1..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootApplication.class)
public class ParentServiceTest {

    private @Autowired ParentService parentService;

    @Test
    public void testSave(){
        Parent parent = new Parent();
        parent.setName("Team");
        parent = parentService.save(parent);
        System.out.println(parent);
    }
}
