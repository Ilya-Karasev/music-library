package com.example.musiclibrary.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    private String surName;
    private String firstName;
    private String fatherName;
    private int age;

    @Enumerated(EnumType.STRING)
    private Post post;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    public User(String surName, String firstName, String fatherName, int age, Post post, String email, String password) {
        this.surName = surName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.age = age;
        this.post = post;
        this.email = email;
        this.password = password;
    }
    protected User() {
    }
    @Column(name = "Surname", length = 100, nullable = false)
    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
    @Column(name = "Firstname", length = 100, nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name = "Fathername", length = 100)
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    @Column(name = "Age", length = 3, nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Column(name = "Post", length = 12, nullable = false)
    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
    @Column(name = "Email", length = 20, nullable = false, unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name = "Password", length = 20, nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
