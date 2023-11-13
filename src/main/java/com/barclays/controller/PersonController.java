package com.barclays.controller;

import com.barclays.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @GetMapping("/people")
    public List<Person> getPeople(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice"));
        people.get(0).setEmail("alice.yu@gmail.com");
        people.add(new Person("Bobby"));
        people.get(1).setEmail("bayvazov@gmail.com");


        return people;
    }
}
