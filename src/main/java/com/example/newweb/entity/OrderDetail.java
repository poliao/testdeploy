package com.example.newweb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "tableId")
    private tables table;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private customer customer;

    @ManyToOne
    @JoinColumn(name = "menuId")
    private menuitem menuItem;

    
}
