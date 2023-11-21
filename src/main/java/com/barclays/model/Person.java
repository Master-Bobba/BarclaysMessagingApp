package com.barclays.model;

import jakarta.persistence.*;
import lombok.*;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Setter
@Getter
@Entity
@ToString
public class Person {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "sender")
    private List<Message> sentMessages;

    public Person(String name, String email){
        this.name = name;
        this.email = email;
        sentMessages = new ArrayList<>();
    }
    public Person(String name){
        this.name = name;
        sentMessages = new ArrayList<>();
    }



}

/**
 * That above (the annotations) is lombok
 */