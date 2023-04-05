package com.indekos.dto.response;

import com.indekos.model.Room;
import com.indekos.model.RoomDetail;
import com.indekos.model.RoomPriceDetail;
import lombok.Data;

import java.util.List;

@Data
public class RoomWithDetails {
	
	Room room;
	List<RoomPriceDetail> prices;
	List<RoomDetail> details;
	Integer tenantsInRoom;
	String roomStatus;
}
