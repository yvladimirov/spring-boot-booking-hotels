package com.home.hotel.booking.service;

import com.home.hotel.booking.response.Hotel;
import com.home.hotel.booking.response.Hotels;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yvladimirov on 31.03.15.
 */
@Service
public class HotelService {
    private Map<Integer, Hotel> hotels;

    public HotelService() {
        this.hotels = new HashMap<Integer, Hotel>();
        this.hotels.put(1, new Hotel(1, "Hotel Lozano"));
        this.hotels.put(2, new Hotel(2, "Hotel Non Stop "));
        this.hotels.put(3, new Hotel(3, "Grand Route"));
        this.hotels.put(4, new Hotel(4, "Beach Hotel"));
    }

    public Hotel getById(int hotelId) {
        return hotels.get(hotelId);
    }

    public Hotels getAll() {

        return new Hotels(new ArrayList<Hotel>(hotels.values()), 100, 0, hotels.size());
    }
}

