package com.nirman.rest.webservices.flightsearchwebservices.controller;

import com.nirman.rest.webservices.flightsearchwebservices.model.BookingDetails;
import com.nirman.rest.webservices.flightsearchwebservices.model.FlightDetails;
import com.nirman.rest.webservices.flightsearchwebservices.serviceI.FlightBookingServiceI;
import com.nirman.rest.webservices.flightsearchwebservices.serviceI.FlightSearchServiceI;
import com.nirman.rest.webservices.flightsearchwebservices.serviceI.StoreBookingDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightSearchController {

    @Autowired
    private FlightSearchServiceI flightSearch;

    @Autowired
    private StoreBookingDetails storeBookingDetails;

    @GetMapping("/all-flights")
    private List<FlightDetails> getAllFlightDetails(){
        return flightSearch.getAllFlights();
    }

    @GetMapping("/search-flight/{from}/{to}/{dateVal}")
    private List<FlightDetails> getSearchedFlightDetails(@PathVariable String from,
                                                         @PathVariable String to,
                                                         @PathVariable String dateVal){
        return flightSearch.searchedFlightDetails(from,to,dateVal);
    }

    @PostMapping("/book-flight")
    public void storeBookingDet(@RequestBody BookingDetails bookingDetails){

        storeBookingDetails.storeBookingDetails(bookingDetails);
    }



}
