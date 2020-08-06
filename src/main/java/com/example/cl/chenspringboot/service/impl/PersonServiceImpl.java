package com.example.cl.chenspringboot.service.impl;

import com.example.cl.chenspringboot.bean.Person;
import com.example.cl.chenspringboot.dao.PersonMapper;
import com.example.cl.chenspringboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @Author cl
 * @Date 2020/8/4 17:15
 * @Version 1.0
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
     private PersonMapper mapper;
    @Override

    public List<Person> findAll() {
        return mapper.findAll();
    }
}
