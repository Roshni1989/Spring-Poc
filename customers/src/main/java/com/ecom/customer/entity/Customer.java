package com.ecom.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int customerId;
    private String custName;
    private String address;
    private int phoneNo;


    public Customer() {
    }

    public Customer(int customerId, String custName) {
        this.customerId = customerId;
        this.custName = custName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", custName='" + custName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
