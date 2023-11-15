package com.barclays.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Message {

    @Id
    @GeneratedValue
    private Integer id;
    private String content;

    public Message(int id, String content){
        this.id = id;
        this.content = content;
    }

    public Message(String content){
        this.content = content;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

/**
 * @Entity - binds the class to a database table called 'Message" - same as the class name
 * will be looking for columns ID and content
 */