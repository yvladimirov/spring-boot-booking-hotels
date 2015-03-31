package com.home.hotel.booking.response;

/**
 * Created by yvladimirov on 31.03.15.
 */
public class Hotel {
    private int id;
    private String name;

    public Hotel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
