package com.barclays.util;

import com.barclays.model.Message;
import com.barclays.model.Person;
import com.barclays.repository.PersonRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class PersonPopulator {

    private PersonRepository personRepository;

    @Autowired
    public PersonPopulator(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public void populate(){
        personRepository.save(new Person("Alice", "alice@gmail.com"));

        personRepository.save(new Person("Bobby", "bobby@gmail.com"));
        personRepository.save(new Person("Bruce", "bruce@gmail.com"));
        personRepository.save(new Person("Alex", "Alex@gmail.com"));
    }


}
