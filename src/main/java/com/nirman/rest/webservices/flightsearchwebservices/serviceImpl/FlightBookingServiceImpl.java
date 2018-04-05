package com.nirman.rest.webservices.flightsearchwebservices.serviceImpl;

import com.nirman.rest.webservices.flightsearchwebservices.serviceI.FlightBookingServiceI;
import com.nirman.rest.webservices.flightsearchwebservices.serviceI.FlightSearchServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlightBookingServiceImpl implements FlightBookingServiceI{
    @Autowired
    private FlightSearchServiceImpl flightSearchServiceI;

    @Override
    public double getFlightTicketBookingCost(String fromCity, String toCity, String dateVal, int noTicket) {
        flightSearchServiceI.reduceAvailableSeats(fromCity,toCity,dateVal,noTicket);
        return 0;
    }
}
