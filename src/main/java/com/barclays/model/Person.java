package com.barclays.model;

import jakarta.persistence.*;
import lombok.*;

import java.beans.ConstructorProperties;


@NoArgsConstructor
@Setter
@Getter
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String email;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Address address;

    public Person(String name, String email){
        this.name = name;
        this.email = email;
    }
    public Person(String name){
        this.name = name;
    }

}

/**
 * That above (the annotations) is lombok
 */