package com.barclays.service;

import com.barclays.model.Message;
import com.barclays.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();
    Person findById(int id);
    List<Person> findByNameContains(String filter);
    List<Person> searchByName(String name);

    Person save(Person person);

}
