package com.indekos.repository;

import com.indekos.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, String> {
	
	List<Announcement> findAllByOrderByCreatedDateDesc();
	Announcement findByTitle(String title);
	Announcement findByTitleAndIdNot(String title, String id);
}