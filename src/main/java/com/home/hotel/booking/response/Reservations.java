package com.home.hotel.booking.response;

import java.util.List;

/**
 * Created by yvladimirov on 31.03.15.
 */
public class Reservations {
    private List<Reservation> reservations;
    private int limit;
    private int offset;
    private int total;


    public Reservations(List<Reservation> reservations, int limit, int offset, int total) {
        this.reservations = reservations;
        this.limit = limit;
        this.offset = offset;
        this.total = total;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public int getLimit() {
        return limit;
    }

    public int getOffset() {
        return offset;
    }

    public int getTotal() {
        return total;
    }
}
