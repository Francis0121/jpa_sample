package com.study.jpa.service;

import com.study.jpa.entity.Composite;
import com.study.jpa.repository.CompositeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by francis on 2015. 12. 2..
 */
@Service
public class CompositeService {

	private @Autowired CompositeRepository compositeRepository;

    public void save(Composite composite){
        compositeRepository.save(composite);
    }

    public void delete(Composite composite){
        compositeRepository.delete(composite);
    }
}
