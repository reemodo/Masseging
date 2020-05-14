package com.example.masseging;

public class Neighborhoods {
    private int neighborhood_id, city_id ;
    private String neighborhood_name;

    public int getNeighborhood_id() {
        return neighborhood_id;
    }

    public void setNeighborhood_id(int neighborhood_id) {
        this.neighborhood_id = neighborhood_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getNeighborhood_name() {
        return neighborhood_name;
    }

    public void setNeighborhood_name(String neighborhood_name) {
        this.neighborhood_name = neighborhood_name;
    }
}
