package com.vti.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "news_recruitment")
public class News {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title",length = 500, nullable = false)
    private String title;

    @Column(name = "`description`", length = 800, nullable = false)
    private String description;

    @Column(name = "imgURL", length = 800, nullable = false)
    private String imgURL;
}
