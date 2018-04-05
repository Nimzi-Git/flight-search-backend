package com.nirman.rest.webservices.flightsearchwebservices.model;

import org.springframework.stereotype.Component;

@Component
public class BookingDetails {
    private String fromCity;
    private String toCity;
    private String travelDate;
    private int noOfTraveller;



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

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public int getNoOfTraveller() {
        return noOfTraveller;
    }

    public void setNoOfTraveller(int noOfTraveller) {
        this.noOfTraveller = noOfTraveller;
    }
}
