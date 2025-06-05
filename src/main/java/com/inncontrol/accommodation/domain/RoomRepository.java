package com.inncontrol.accommodation.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    Optional<Room> findByRoomNumber(int roomNumber);
    List<Room> findByRoomType(RoomType roomType);
    List<Room> findByRoomStatus(RoomStatus roomStatus);
}
