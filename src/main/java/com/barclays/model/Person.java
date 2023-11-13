package com.barclays.model;


import lombok.*;

import java.beans.ConstructorProperties;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Person {

    private String name;
    private String email;

}

/**
 * That above (the annotations) is lombok
 */