package com.indekos.controller;

import com.indekos.common.helper.GlobalAcceptions;
import com.indekos.common.helper.exception.ResourceNotFoundException;
import com.indekos.dto.request.AnnouncementRequest;
import com.indekos.services.AnnouncementService;
import com.indekos.utils.Validated;
import org.apache.tomcat.util.http.fileupload.impl.FileSizeLimitExceededException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

@RestController
@RequestMapping("/announcement")
public class AnnouncementController {

	@Autowired
	private AnnouncementService announcementService;
	
	@GetMapping("/{announcementId}")
	public ResponseEntity<?> getAnnouncement(@PathVariable String announcementId) {
		return GlobalAcceptions.data(announcementService.getById(announcementId), "Announcement Data");
	}
	
	@GetMapping
	public ResponseEntity<?> getAllAnnouncement() {
		return GlobalAcceptions.listData(announcementService.getAll(), "All Announcement Data");
	}
	
	@PostMapping
	public ResponseEntity<?> createAnnouncement(@ModelAttribute MultipartFile image, @Valid @ModelAttribute AnnouncementRequest request, Errors errors) throws FileSizeLimitExceededException {
		Validated.request(errors);
		request.setImage(image);
		return GlobalAcceptions.data(announcementService.create(request), "Created Announcement Data");
	}
	
	@PutMapping("/{announcementId}")
	public ResponseEntity<?> updateAnnouncement(@PathVariable String announcementId, @ModelAttribute MultipartFile image, @Valid @ModelAttribute AnnouncementRequest request) throws ResourceNotFoundException, FileSizeLimitExceededException {
		request.setImage(image);
		return GlobalAcceptions.data(announcementService.update(announcementId, request), "Updated Announcement Data");
	}
	
	@DeleteMapping("/{announcementId}")
	public ResponseEntity<?> deleteAnnouncement(@PathVariable String announcementId) throws ResourceNotFoundException {
		return GlobalAcceptions.data(announcementService.delete(announcementId), "Deleted Announcement Data");
	}
}