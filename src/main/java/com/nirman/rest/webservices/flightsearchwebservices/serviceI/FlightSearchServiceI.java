package com.nirman.rest.webservices.flightsearchwebservices.serviceI;

import com.nirman.rest.webservices.flightsearchwebservices.model.FlightDetails;

import java.util.List;

public interface FlightSearchServiceI {
    public List<FlightDetails> getAllFlights();
    public List<FlightDetails> searchedFlightDetails(String fromCity, String toCity, String dateVal);
}
