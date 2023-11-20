package com.barclays.service;

import com.barclays.model.Message;
import com.barclays.model.Person;
import com.barclays.repository.MessageRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
//@AllArgsConstructor
public class MessageServiceImpl implements MessageService{

    private MessageRepository messageRepository;

    @Autowired  // not required in hte latest version of Spring. Done automatically
    public MessageServiceImpl(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> findAll() {
        Iterable<Message> messagesItr = messageRepository.findAll();
        List<Message> messages = new ArrayList<>();
        messagesItr.forEach(messages::add);
        return messages;
    }

    @Override
    public Message findById(int id){
        Optional<Message> messageOptional = messageRepository.findById(id);
        return messageOptional.orElseGet(() -> new Message("Default Message: Nothing found with id = " + id));
    }

    @Override
    public List<Message> findByContentContains(String filter) {
        return messageRepository.findByContentContains(filter);
    }

    @Override
    public Message save(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void deleteById(int id) {
        messageRepository.deleteById(id);
    }


}
