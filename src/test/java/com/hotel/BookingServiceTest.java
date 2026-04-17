package com.hotel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingServiceTest {

    @Test
    public void testBookingSuccess() {
        BookingService service = new BookingService();
        assertEquals("Booking successful", service.bookRoom(1));
    }

    @Test
    public void testDoubleBooking() {
        BookingService service = new BookingService();
        service.bookRoom(1);
        assertEquals("Room already booked", service.bookRoom(1));
    }

    @Test
    public void testCancellation() {
        BookingService service = new BookingService();
        service.bookRoom(1);
        assertEquals("Booking cancelled", service.cancelBooking(1));
    }
}