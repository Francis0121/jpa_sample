package com.study.jpa.service;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.jpa.config.RootApplication;
import com.study.jpa.entity.Composite;
import com.study.jpa.entity.CompositePk;

/**
 * Created by francis on 2015. 12. 2..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootApplication.class)
public class CompositeServiceTest {

    private static final Long pid = 1l;
    private static final Long uid = 1l;

    private @Autowired CompositeService compositeService;

    private static Composite composite;

    @Before
    public void before(){
        composite = new Composite();
        CompositePk compositePk = new CompositePk();
        compositePk.setPid(pid);
        compositePk.setUid(uid);
        composite.setCompositePk(compositePk);
        composite.setDate(new Date());
        compositeService.delete(composite);
    }

    @Test
    public void test(){
        System.out.println("\n===Save===");
        compositeService.save(composite);
        System.out.println("\n===Resave===");
        compositeService.save(composite);
        System.out.println("\n===Delete===");
        compositeService.delete(composite);
        System.out.println("\n===ReDelete===");
        compositeService.delete(composite);
    }

}
