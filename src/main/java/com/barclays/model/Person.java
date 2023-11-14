package com.barclays.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.beans.ConstructorProperties;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Person {
    @Id
    private Integer id;
    private String name;
    private String email;

}

/**
 * That above (the annotations) is lombok
 */