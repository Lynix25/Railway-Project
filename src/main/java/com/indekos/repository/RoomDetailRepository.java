package com.indekos.repository;

import com.indekos.model.Room;
import com.indekos.model.RoomDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomDetailRepository extends JpaRepository<RoomDetail, Long> {
	
	RoomDetail findByRoomAndId(Room room, Long id);
	List<RoomDetail> findByRoom(Room room);
}
