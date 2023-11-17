package com.barclays.util;

import com.barclays.model.Address;
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
//        personRepository.save(new Person("Alice", "alice@gmail.com"));
//
//        personRepository.save(new Person("Bobby", "bobby@gmail.com"));
//        personRepository.save(new Person("Bruce", "bruce@gmail.com"));
//        personRepository.save(new Person("Alex", "Alex@gmail.com"));
        Person person = new Person();
        person.setName("Bryan");
        person.setEmail("emaail@email.com");

        Address address = new Address();
        address.setLineOne("123 Tom St");
        address.setLineTwo("Unit G");
        address.setState("Utah");
        address.setPostalCode("84-065");
        address.setCountry("USA");

        person.setAddress(address);
        personRepository.save(person);


        Address address2 = new Address();
        address2.setLineOne("156 Tom St");
        address2.setLineTwo("Unit D");
        address2.setState("Utah");
        address2.setPostalCode("84-075");
        address2.setCountry("USA");

        Person person2 = new Person();
        person2.setName("Steve");
        person2.setEmail("Steve@abc.com");
        person2.setAddress(address2);

        personRepository.save(person2);

    }


}
