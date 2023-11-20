package com.barclays.controller;

import com.barclays.model.Message;
import com.barclays.model.Person;
import com.barclays.service.PersonService;
import io.micrometer.common.util.StringUtils;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/people")
    public List<Person> getAllPeople(@PathParam("filter") String filter){
        log.debug("in the getAll People method.");
        List<Person> people;
        if (StringUtils.isNotBlank(filter)){
            people = personService.findByNameContains(filter);
        } else {
            people = personService.findAll();
        }
        return people;
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

    @GetMapping("/person/search")
    public List<Person>searchByName(@PathParam("name") String name) {
        return personService.searchByName(name);
    }

    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person){
        log.debug(String.valueOf(person));
        return personService.save(person);
    }

    @PutMapping("/person")
    public Person updatePerson(@RequestBody Person person){
        log.debug(String.valueOf(person));
        return personService.save(person);
    }




}
