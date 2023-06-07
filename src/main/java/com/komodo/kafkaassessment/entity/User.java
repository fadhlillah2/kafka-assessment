package com.komodo.kafkaassessment.entity;

import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User implements Serializable {
    
    private String name;
    private String address;
    private String phone;
    private int age;

    // getters and setters...
}
