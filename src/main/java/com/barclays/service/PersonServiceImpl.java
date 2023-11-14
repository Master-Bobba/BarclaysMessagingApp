package com.barclays.service;

import com.barclays.model.Person;
import com.barclays.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class PersonServiceImpl implements PersonService{

    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        List<Person> people = new ArrayList<>();
        Iterable<Person> personIterable = personRepository.findAll();
        personIterable.forEach(people::add);
        return people;
    }

    @Override
    public Person findById(int id) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(0, "Alice", "alice@gmail.com "));
        people.add(new Person(1, "Bobby","bayvazov@gmail.com "));
        return people.get(id);
    }
}
