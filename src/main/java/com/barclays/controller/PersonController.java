package com.barclays.controller;

import com.barclays.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class PersonController {


    @GetMapping("/people")
    public List<Person> getAllPeople(){
        log.debug("in the getAll People method.");
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice","alice.yu@gmail.com"));
        people.add(new Person("Bobby","bayvazov@gmail.com"));

        return people;
    }

    @GetMapping("/person/{i}")
    public Person getPerson(@PathVariable int i, @RequestParam(value = "filter", defaultValue = "None", required = false) String filter){
        log.debug("in the getPerson method, obtaining record " + i);
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", "alice@gmail.com "));
        people.add(new Person(filter,"bayvazov@gmail.com "));
        log.debug("Filter is " + filter);
        return people.get(i);
    }

}
