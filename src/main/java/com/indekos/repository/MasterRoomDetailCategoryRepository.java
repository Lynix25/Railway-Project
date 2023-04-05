package com.indekos.repository;

import com.indekos.model.MasterRoomDetailCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MasterRoomDetailCategoryRepository extends JpaRepository<MasterRoomDetailCategory, Long> {
	
	MasterRoomDetailCategory findByName(String name);
	List<MasterRoomDetailCategory> findAllByOrderByIdAsc();
}
