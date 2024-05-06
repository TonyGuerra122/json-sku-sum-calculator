package com.tony.utils;

import java.util.List;
import java.util.Map;

import com.tony.models.Item;
import com.tony.models.Order;
import com.tony.models.OrderContainer;

public final class OrderProcessor {

    private OrderContainer orderContainer;

    public OrderProcessor(OrderContainer orderContainer) {
        this.orderContainer = orderContainer;
    }

    public OrderContainer getOrderContainer() {
        return orderContainer;
    }

    public void setOrderContainer(OrderContainer orderContainer) {
        this.orderContainer = orderContainer;
    }

    public double getTotalWeight() {
        double totalWeight = 0.0;
        Map<String, Order> orders = this.orderContainer.getOrders();
        Map<String, Double> weightPerSku = this.orderContainer.getWeightPerSku();

        for (Order order : orders.values()) {
            for (List<Item> items : order.getBoxes().values()) {
                for (Item item : items) {
                    Double itemWeigth = weightPerSku.get(item.getSku());
                    if (itemWeigth != null) {
                        totalWeight += itemWeigth * item.getQuantity();
                    }
                }
            }
        }

        return totalWeight;
    }
}
