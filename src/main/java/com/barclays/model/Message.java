package com.barclays.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Message {

    @Id
    private Integer id;
    private String content;

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