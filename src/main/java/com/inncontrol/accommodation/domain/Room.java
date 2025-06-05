package com.inncontrol.accommodation.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(nullable = false, unique = true)
    @JsonProperty("roomNumber")
    private int roomNumber;

    @Enumerated(EnumType.STRING)
    @JsonProperty("roomType")
    private RoomType roomType;

    @Enumerated(EnumType.STRING)
    @JsonProperty("roomStatus")
    private RoomStatus roomStatus;

    // Constructor
    public Room(int roomNumber, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }


    // Default constructor
    public Room() {
    }
}