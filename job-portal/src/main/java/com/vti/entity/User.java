package com.vti.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "`User`")
public class User {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username", length = 50, unique = true, nullable = false)
    private String username;

    @Column(name = "`password`", length = 800, nullable = false)
    private String password;

    @Column(name = "email", length = 200, nullable = false, unique = true)
    private String email;

    @Column(name = "firstName", length = 50, nullable = false)
    private String firstName;

    @Column(name = "lastName", length = 50, nullable = false)
    private String lastName;

    @Column(name = "`role`")
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "`status`", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
}
