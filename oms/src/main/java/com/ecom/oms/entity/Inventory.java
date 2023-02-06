package com.ecom.oms.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Inventory {

    @Id
    @GeneratedValue
    private int id;

    private String productName;

    private String dealerName;

    private int availbleQuantitiy;

    public Inventory(String product, int availbleQuantitiy) {
        this.productName = product;
        this.availbleQuantitiy = availbleQuantitiy;
    }

}
