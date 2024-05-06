package com.tony.models;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderContainer implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("pedidos")
    private Map<String, Order> orders;

    @JsonProperty("pesoPorSku")
    private Map<String, Double> weightPerSku;

    public Map<String, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<String, Order> orders) {
        this.orders = orders;
    }

    public Map<String, Double> getWeightPerSku() {
        return weightPerSku;
    }

    public void setWeightPerSku(Map<String, Double> weightPerSku) {
        this.weightPerSku = weightPerSku;
    }

}
