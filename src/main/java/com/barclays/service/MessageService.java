package com.barclays.service;

import com.barclays.model.Message;
import com.barclays.model.Person;

import java.util.List;

public interface MessageService {
    List<Message> findAll();
    Message findById(int id);
    List<Message> findByContentContains(String filter);

    Message save(Message message);
    void deleteById(int id);

}
