package com.vti.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Recruiter")
public class Recruiter {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", length = 800, nullable = false)
    private String title;

    @Column(name = "`description`", length = 1000, nullable = false)
    private String description;

    @Column(name = "skills", length = 200, unique = true,nullable = false)
    private String skills;

    @Column(name = "salary")
    private int salary;

    @Column(name = "`position`", length = 200, nullable = false)
    private String position;

    @Column(name = "address", length = 300, nullable = false)
    private String address;

    @Column(name = "created_date")
    @CreationTimestamp
    private Date createdDate;

    @Column(name = "updated_date")
    @UpdateTimestamp
    private Date updatedDate;
}
