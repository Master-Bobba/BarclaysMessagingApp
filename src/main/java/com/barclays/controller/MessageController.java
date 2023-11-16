package com.barclays.controller;

import com.barclays.model.Message;
import com.barclays.service.MessageService;
import io.micrometer.common.util.StringUtils;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService){
        this.messageService = messageService;
    }

    @GetMapping("/messages")
    public List<Message> getAllMessages(@PathParam("filter") String filter){

        List<Message> messages = Collections.emptyList();
        if (StringUtils.isNotBlank(filter)){
            messages = messageService.findByContentContains(filter);
        } else {
            messages = messageService.findAll();
        }
        return messages;
    }

    @GetMapping("/messages/{id}")
    public Message getMessage(@PathVariable int id){
        return messageService.findById(id);
    }


//    @GetMapping("/messages/{id}")
//    public Message getMessage(@PathVariable int id, @RequestParam(value = "filter", defaultValue = "No filter", required = false) String filter){
//        Message message = new Message();
//        message.setContent("the message " + id + " is " + filter);
//        return message;
//    }

}


/**
 * @RestController annotation is not enough
 * We need Mapping as well i.e. @GetMapping, @PostMapping, @PutMapping or @DeleteMapping
 */