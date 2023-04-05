package com.indekos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.indekos.common.base.entity.AuditableEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@AllArgsConstructor @NoArgsConstructor
public class Room extends AuditableEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Column(unique = true, nullable = false)
    private String name;
	
	/* Letak lantai kamar */
	@Column(nullable = false)
	private Integer floor;

	/* Max tenant yang bisa ditampung */
	@Column(nullable = false, columnDefinition = "int default 0")
	private Integer quota;	
	
	/* Kamar untuk Putra/ Putri/ Pasutri */
	@Column(nullable = false)
	private String allotment;
	
	private String description;
	
	@Column(nullable = false, columnDefinition = "boolean default false")
	private boolean isDeleted;

	/* Alokasi harga */
	@JsonIgnore
	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	private List<RoomPriceDetail> prices;

	/* Detail fasilitas */
	@JsonIgnore
	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	private List<RoomDetail> details;

	/* User yang tinggal pada ruangan */
	@JsonIgnore
	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	private List<User> users;

//	private List<String> rules;
//	private List<String> specification;
//	private List<String> bathRoomFacilities;
}