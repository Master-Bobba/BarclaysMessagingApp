package com.barclays.util;

import com.barclays.model.Message;
import com.barclays.repository.MessageRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor

public class Populator {

    private MessageRepository messageRepository;

    @Autowired
    public Populator(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    public void populate(){
        Message m1 = new Message(100, "First Message");
        messageRepository.save(m1);

        messageRepository.save(new Message("Second Message"));
        messageRepository.save(new Message("Third Message"));
        messageRepository.save(new Message("Fourth Message"));
    }
}
