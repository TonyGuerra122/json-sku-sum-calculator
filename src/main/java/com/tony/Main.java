package com.tony;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tony.models.OrderContainer;
import com.tony.utils.FileManipulator;
import com.tony.utils.OrderProcessor;

public class Main {
    public static void main(String[] args) {
        
        try {
            String json = FileManipulator.readFile("input/data.json");

            ObjectMapper mapper = new ObjectMapper();
            OrderContainer orderContainer = mapper.readValue(json, OrderContainer.class);
            System.out.println("Deserialization successful!");
            System.out.println("Initializing the calculation...");

            OrderProcessor orderProcessor = new OrderProcessor(orderContainer);

            System.out.println("Total weigth: " + orderProcessor.getTotalWeight() + " g");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}