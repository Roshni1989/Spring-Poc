package com.ecom.prd.entity.entity;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue
    int productId;
    String productName;
    String productType;

    @OneToOne()
    @JoinColumn(name = "dealer_id")
    Dealer dealer;

    double price;

    public Product(int productId, String productName, String productType, double price,Dealer dealerId) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.price = price;
        this.dealer = dealerId;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", dealer='" + dealer + '\'' +
                ", price=" + price +
                '}';
    }
}
