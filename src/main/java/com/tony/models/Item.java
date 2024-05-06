package com.tony.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item implements Serializable{
    private static final long serialVersionUID = 1L;

    @JsonProperty("sku")
    private String sku;

    @JsonProperty("qtd")
    private int quantity;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
