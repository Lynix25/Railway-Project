package com.indekos.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = false)
@Data
public class AnnouncementRequest extends AuditableRequest {
	
	@NotBlank(message = "Title name is required")
	private String title;
	
	@NotBlank(message = "Description name is required")
	private String description;
	
	@NotBlank(message = "Period name is required")
	private String period;
	
	private MultipartFile image;
}