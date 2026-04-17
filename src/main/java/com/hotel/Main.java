package com.hotel;

public class Main {
    public static void main(String[] args) {
        BookingService service = new BookingService();

        System.out.println(service.bookRoom(1));
        System.out.println(service.bookRoom(1));
        System.out.println(service.cancelBooking(1));
    }
}