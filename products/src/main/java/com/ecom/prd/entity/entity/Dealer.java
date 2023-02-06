package com.ecom.prd.entity.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dealer {

    @Id
    @GeneratedValue
    private int dealerId;

    private String dealerName;

    private String dealerPhone;

    public Dealer(){

    }
    public Dealer(int dealerId, String dealerName) {
        this.dealerId = dealerId;
        this.dealerName = dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public void setDealerPhone(String dealerPhone) {
        this.dealerPhone = dealerPhone;
    }

    public int getDealerId() {
        return dealerId;
    }

    public String getDealerName() {
        return dealerName;
    }

    public String getDealerPhone() {
        return dealerPhone;
    }
}
