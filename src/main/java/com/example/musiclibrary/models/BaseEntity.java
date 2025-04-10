package com.example.musiclibrary.models;
import jakarta.persistence.*;
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;
    public Long getId() {
        return id;
    }
    protected void setId(Long id) {
        this.id = id;
    }
}