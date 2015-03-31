package com.home.hotel.booking.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by yvladimirov on 31.03.15.
 */
public class Reservation {
    private int id;
    private int price;
    private int userId;


    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    @JsonProperty("user_id")
    public int getUserId() {
        return userId;
    }
}
