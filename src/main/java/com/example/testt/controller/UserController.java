package com.example.testt.controller;

import com.example.testt.essence.Person;
import com.example.testt.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/")
    public Iterable<Person> home(){
        return personRepository.findAll();
    }
}
