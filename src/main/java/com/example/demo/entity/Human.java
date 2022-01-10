package com.example.demo.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "Humans")
public class Human {
    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "Name", nullable = false)
    private String name;

    @Lob @Type(type = "org.hibernate.type.TextType")
    @Column(name = "Surname", nullable = false)
    private String surname;

    @Column(name = "Age", nullable = false)
    private Long age;

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}