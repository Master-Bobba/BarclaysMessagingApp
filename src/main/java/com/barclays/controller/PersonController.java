package com.barclays.controller;

import com.barclays.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class PersonController {

    private List<Person> people = new ArrayList<>();

    @GetMapping("/people")
    public List<Person> getAllPeople(){
        log.debug("in the getAll People method.");
        people.add(new Person("Alice","alice.yu@gmail.com"));
        people.add(new Person("Bobby","bayvazov@gmail.com"));

        return people;
    }

    @GetMapping("/person/{i}")
    public Person getPerson(@PathVariable int i){
        people.add(new Person("Alice","alice.yu@gmail.com"));
        people.add(new Person("Bobby","bayvazov@gmail.com"));
        return this.people.get(i);
    }

}
