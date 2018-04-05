package com.nirman.rest.webservices.flightsearchwebservices.controller;

import com.nirman.rest.webservices.flightsearchwebservices.model.BookingDetails;
import com.nirman.rest.webservices.flightsearchwebservices.serviceI.FlightBookingServiceI;
import com.nirman.rest.webservices.flightsearchwebservices.serviceI.StoreBookingDetails;
import com.nirman.rest.webservices.flightsearchwebservices.serviceImpl.StoreBookingDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightBookingController {

    @Autowired
    private FlightBookingServiceI flightBookingServiceI;

    @Autowired
    private StoreBookingDetailsImpl storeBookingDetails;

    @GetMapping("/book-flight/{from}/{to}/{date}/{tickets}")
    public double getTicketPrice(@PathVariable String from,
                                 @PathVariable String to,
                                 @PathVariable String date,
                                 @PathVariable int tickets)
    {
        return flightBookingServiceI.getFlightTicketBookingCost(from, to, date, tickets);
    }

    @GetMapping("/all-bookings")
    public List<BookingDetails> getAllBooking(){
        return storeBookingDetails.getCompleteBookingDetails();
    }

}
