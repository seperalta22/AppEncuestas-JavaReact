package com.sergioperalta.backendencuesta.entities;


import jakarta.persistence.*;
import lombok.Data; //! lombok is a library that helps to generate getters and setters

@Entity(name="users")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, length = 255)
    private String email;

    @Column(nullable = false)
    private String encryptedPassword;
}
