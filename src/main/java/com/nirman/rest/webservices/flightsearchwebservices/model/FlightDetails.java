package com.nirman.rest.webservices.flightsearchwebservices.model;

import java.time.LocalDate;

public class FlightDetails {
    private String fromCity;
    private String toCity;
    private LocalDate travelDate;
    private int noTraveller;
    private int totalFlightSeats;
    private double ticketPrice;


    public FlightDetails() {
    }

    public FlightDetails(String fromCity, String toCity, LocalDate travelDate,
                         int noTraveller, int totalFlightSeats, double ticketPrice) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.travelDate = travelDate;
        this.noTraveller = noTraveller;
        this.totalFlightSeats = totalFlightSeats;
        this.ticketPrice = ticketPrice;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public LocalDate getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(LocalDate travelDate) {
        this.travelDate = travelDate;
    }

    public int getNoTraveller() {
        return noTraveller;
    }

    public void setNoTraveller(int noTraveller) {
        this.noTraveller = noTraveller;
    }

    public int getTotalFlightSeats() {
        return totalFlightSeats;
    }

    public void setTotalFlightSeats(int totalFlightSeats) {
        this.totalFlightSeats = totalFlightSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "FlightDetails{" +
                "fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                ", travelDate=" + travelDate +
                ", noTraveller=" + noTraveller +
                ", totalFlightSeats=" + totalFlightSeats +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

}
