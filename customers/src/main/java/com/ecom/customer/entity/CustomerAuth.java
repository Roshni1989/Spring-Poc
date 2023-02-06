package com.ecom.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustomerAuth {

    @Id
    @GeneratedValue

    private int id;

    private String custName;

    private String password;

}
