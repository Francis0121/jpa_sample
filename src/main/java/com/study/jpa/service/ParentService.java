package com.study.jpa.service;

import com.study.jpa.entity.Parent;
import com.study.jpa.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by francis on 2015. 12. 1..
 */
@Service
public class ParentService {

	private @Autowired ParentRepository parentRepository;

    public Parent save(Parent parent){
        return parentRepository.save(parent);
    }
}
