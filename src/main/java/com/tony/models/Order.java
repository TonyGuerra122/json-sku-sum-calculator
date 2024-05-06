package com.tony.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Order {
    private Map<String, List<Item>> boxes = new HashMap<>();

    @JsonAnySetter
    public void addBox(String key, List<Item> value){
        this.boxes.put(key, value);
    }

    public Map<String, List<Item>> getBoxes() {
        return boxes;
    }
    
}
