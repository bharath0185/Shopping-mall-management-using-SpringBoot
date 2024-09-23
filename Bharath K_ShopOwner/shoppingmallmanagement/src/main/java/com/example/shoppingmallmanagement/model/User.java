package com.example.shoppingmallmanagement.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    private String uname;

    private String shopname;

    private LocalDate joiningdate;

    // Constructors, Getters, and Setters

    public User() {}

    public User(String uname, String shopname, LocalDate joiningdate) {
        this.uname = uname;
        this.shopname =shopname;
        this.joiningdate = joiningdate;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getshopname() {
        return shopname;
    }

    public void setshopname(String shopname) {
        this.shopname = shopname;
    }

    public LocalDate getjoiningdate() {
        return joiningdate;
    }

    public void setjoiningdate(LocalDate joiningdate) {
        this.joiningdate = joiningdate;
    }
}
