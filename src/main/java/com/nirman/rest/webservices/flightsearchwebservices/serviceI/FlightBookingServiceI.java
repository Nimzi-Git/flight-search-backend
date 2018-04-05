package com.nirman.rest.webservices.flightsearchwebservices.serviceI;

public interface FlightBookingServiceI {

    public double getFlightTicketBookingCost(String fromCity, String toCity, String dateVal,  int noTicket);
}
