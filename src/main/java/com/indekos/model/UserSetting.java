package com.indekos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@NoArgsConstructor
public class UserSetting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, columnDefinition = "boolean default true")
	private boolean shareRoom;
	
	@Column(nullable = false, columnDefinition = "boolean default true")
	private boolean enableNotification;
	
	@JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

	public UserSetting(User user) {
		super();
		this.user = user;
		this.shareRoom = true;
		this.enableNotification = true;
	}
}