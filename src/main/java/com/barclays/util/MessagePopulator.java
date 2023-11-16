package com.barclays.util;

import com.barclays.model.Message;
import com.barclays.repository.MessageRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class MessagePopulator {

    private MessageRepository messageRepository;

    @Autowired
    public MessagePopulator(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    public void populate(){
        Message m1 = new Message("first Message");
        messageRepository.save(m1);

        messageRepository.save(new Message("second Message"));
        messageRepository.save(new Message("third Message"));
        messageRepository.save(new Message("fourth Message"));
    }
}
