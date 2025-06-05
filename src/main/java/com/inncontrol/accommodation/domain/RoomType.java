package com.inncontrol.accommodation.domain;


public enum RoomType {
    DELUXE,
    STANDARD,
    SUITE;

    public static RoomType fromString(String roomType) {
        try {
            return RoomType.valueOf(roomType.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid room type: " + roomType);
        }
    }
}
