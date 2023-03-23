package com.vti.entity;

import jakarta.persistence.Entity;

@Entity
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private Role role;
    private Status status;
}
