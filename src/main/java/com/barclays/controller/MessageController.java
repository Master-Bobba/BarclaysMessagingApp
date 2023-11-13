package com.barclays.controller;

import com.barclays.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MessageController {

    @GetMapping("/messages")
    public List<Message> getAllMessages(){
        List<Message> messages = new ArrayList<>();
        Message message = new Message();
        message.setContent("Spring is cool");
        messages.add(message);
        return messages;
    }
}


/**
 * @RestController annotation is not enought
 * We need Mapping as well i.e. @GetMapping, @PostMapping, @PutMapping or @DeleteMapping
 */