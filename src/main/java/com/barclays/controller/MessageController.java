package com.barclays.controller;

import com.barclays.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/messages/{id}")
    public Message getMessage(@PathVariable int id, @RequestParam(value = "filter", defaultValue = "No filter", required = false) String filter){
        Message message = new Message();
        message.setContent("the message " + id + " is " + filter);
        return message;
    }

}


/**
 * @RestController annotation is not enought
 * We need Mapping as well i.e. @GetMapping, @PostMapping, @PutMapping or @DeleteMapping
 */