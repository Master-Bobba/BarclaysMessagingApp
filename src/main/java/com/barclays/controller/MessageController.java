package com.barclays.controller;

import com.barclays.model.Message;
import com.barclays.model.Person;
import com.barclays.service.MessageService;
import io.micrometer.common.util.StringUtils;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/messages")
    public List<Message> getAllMessages(@PathParam("filter") String filter) {

        List<Message> messages = Collections.emptyList();
        if (StringUtils.isNotBlank(filter)) {
            messages = messageService.findByContentContains(filter);
        } else {
            messages = messageService.findAll();
        }
        return messages;
    }

    @GetMapping("/messages/{id}")
    public Message getMessage(@PathVariable int id) {
        return messageService.findById(id);
    }


    @PostMapping("/message")
    public Message createPerson(@RequestBody Message message) {
        log.debug(String.valueOf(message));
        return messageService.save(message);
    }

}

/**
 * @RestController annotation is not enough
 * We need Mapping as well i.e. @GetMapping, @PostMapping, @PutMapping or @DeleteMapping
 */