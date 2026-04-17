package com.hotel;

import java.util.HashMap;

public class BookingService {

    private HashMap<Integer, Room> rooms = new HashMap<>();

    public BookingService() {
        for (int i = 1; i <= 5; i++) {
            rooms.put(i, new Room(i));
        }
    }

    public String bookRoom(int roomId) {
        Room room = rooms.get(roomId);

        if (room == null) return "Room not found";

        if (room.isBooked()) {
            return "Room already booked";
        }

        room.book();
        return "Booking successful";
    }

    public String cancelBooking(int roomId) {
        Room room = rooms.get(roomId);

        if (room == null) return "Room not found";

        room.cancel();
        return "Booking cancelled";
    }
}