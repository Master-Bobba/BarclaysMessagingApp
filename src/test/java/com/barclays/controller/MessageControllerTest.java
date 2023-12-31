package com.barclays.controller;


import com.barclays.model.Message;
import com.barclays.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MessageControllerTest {

    @Test
    public void testGetAllMessages() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Message[]> response = restTemplate.getForEntity("http://localhost:8080/messages", Message[].class);
        Message[] messages = response.getBody();
        assertEquals(messages.length, 1);
    }
}
