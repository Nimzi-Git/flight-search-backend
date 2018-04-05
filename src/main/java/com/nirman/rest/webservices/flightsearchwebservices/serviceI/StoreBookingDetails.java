package com.nirman.rest.webservices.flightsearchwebservices.serviceI;

import com.nirman.rest.webservices.flightsearchwebservices.model.BookingDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface StoreBookingDetails {
    public ResponseEntity storeBookingDetails(BookingDetails bookingDetails);
}
