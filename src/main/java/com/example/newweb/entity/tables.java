package com.example.newweb.entity;import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableId;

    @Column(length = 5)
    private Long numbertable;

    // Standard getters and setters
}
