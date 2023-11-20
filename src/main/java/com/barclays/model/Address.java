package com.barclays.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Address {

    @Id
    @GeneratedValue
    private Integer id;
    private String lineOne;
    private String lineTwo;
    private String state;
    private String postalCode;
    private String country;
}
