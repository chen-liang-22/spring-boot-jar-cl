package com.example.cl.chenspringboot.controller;

import com.example.cl.chenspringboot.bean.Person;
import com.example.cl.chenspringboot.service.PersonService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author cl
 * @Date 2020/8/4 17:23
 * @Version 1.0
 */
@RestController
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping(value = "findAll", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Person> findAll() {
        List<Person> list = personService.findAll();

        return list;
    }
}
