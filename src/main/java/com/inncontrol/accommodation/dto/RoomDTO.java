package com.inncontrol.accommodation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * @version 1.0
 */

@Setter
@Getter
public class RoomDTO {

    @NotBlank
    @Size(min = 1, max = 50)
    private int roomNumber;

    @NotBlank
    @Size(min = 1, max = 50)
    private String roomType;

    @NotBlank
    @Size(min = 1, max = 50)
    private String roomStatus;

    public String getRoomType() {
        return roomType;
    }
    public String getRoomStatus() {
        return roomStatus;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

}
