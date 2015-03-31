package com.home.hotel.booking.controller;

import com.home.hotel.booking.response.Hotel;
import com.home.hotel.booking.response.Hotels;
import com.home.hotel.booking.response.Reservation;
import com.home.hotel.booking.response.Reservations;
import com.home.hotel.booking.service.HotelService;
import com.home.hotel.booking.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yvladimirov on 30.03.15.
 */
@RestController
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @Autowired
    private ReservationService reservationService;


    @RequestMapping(value = "/hotels/", method = RequestMethod.GET)
    public Hotels getHotels() {
        return hotelService.getAll();
    }

    @RequestMapping(value = "/hotels/{hotelId}", method = RequestMethod.GET)
    public Hotel getHotel(@PathVariable int hotelId) {
        return hotelService.getById(hotelId);
    }

    @RequestMapping(value = "/hotels/{hotelId}/reservation", method = RequestMethod.GET)
    public Reservations getReservation(@PathVariable int hotelId) {
        return reservationService.getAll(hotelId);
    }


    @RequestMapping(value = "/hotels/{hotelId}/reservation", method = RequestMethod.POST)
    public Reservation createReservation(@PathVariable int hotelId, @RequestBody Reservation reservation) {
        return reservationService.create(hotelId, reservation);
    }

    @RequestMapping(value = "/hotels/{hotelId}/reservation/{reservationId}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable int hotelId, @PathVariable int reservationId) {
        return reservationService.getById(hotelId, reservationId);
    }

    @RequestMapping(value = "/hotels/{hotelId}/reservation/{reservationId}", method = RequestMethod.DELETE)
    public Reservation deleteReservation(@PathVariable int hotelId, @PathVariable int reservationId) {
        return reservationService.delete(hotelId, reservationId);
    }

    @RequestMapping(value = "/hotels/{hotelId}/reservation/{reservationId}", method = RequestMethod.PUT)
    public Reservation updateReservation(@PathVariable int hotelId, @PathVariable int reservationId, @RequestBody Reservation reservation) {
        return reservationService.update(hotelId, reservation);
    }
}
