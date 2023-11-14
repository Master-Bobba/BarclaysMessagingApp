package com.barclays.controller;

import com.barclays.model.Message;
import com.barclays.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PersonControllerTest {

    @Test
    public void testGetAllPeople() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Person[]> response = restTemplate.getForEntity("http://localhost:8080/people", Person[].class);
        Person[] person= response.getBody();
        assertEquals(person.length, 2);
    }

    @Test
    public void testGetOnePerson() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Person> response = restTemplate.getForEntity("http://localhost:8080/person/0", Person.class);
        Person person= response.getBody();
        assertEquals(person.getName(), "Alice");
    }
    @Test
    public void testGetOnePersonWithFilter() {
        RestTemplate restTemplate = new RestTemplate();
        Person person = restTemplate.getForObject("http://localhost:8080/person/1?filter=test", Person.class);

        assertEquals(person.getName(), "test");
    }
}
