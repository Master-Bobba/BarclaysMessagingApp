package com.barclays.controller;

import com.barclays.model.Message;
import com.barclays.model.Person;
import com.barclays.service.PersonService;
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

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/people")
    public List<Person> getAllPeople(){
        log.debug("in the getAll People method.");
        return personService.findAll();
    }

    @GetMapping("/people/{id}")
    public Person getMessage(@PathVariable int id){
        return personService.findById(id);
    }

//    @GetMapping("/person/{i}")
//    public Person getPerson(@PathVariable int i, @RequestParam(value = "filter", defaultValue = "None", required = false) String filter){
//        log.debug("in the getPerson method, obtaining record " + i);
//        List<Person> people = new ArrayList<>();
//        people.add(new Person("Alice", "alice@gmail.com "));
//        people.add(new Person(filter,"bayvazov@gmail.com "));
//        log.debug("Filter is " + filter);
//        return people.get(i);
//    }

}
