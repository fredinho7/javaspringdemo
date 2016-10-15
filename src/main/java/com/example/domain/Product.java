package com.example.domain;

/**
 * Created by Linux. on 2016-10-15.
 */
public abstract class Product {
    
    Integer id;
    String prdName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

}
