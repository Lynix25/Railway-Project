package com.indekos.model;

import com.indekos.common.base.entity.AuditableEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@AllArgsConstructor @NoArgsConstructor
public class Service extends AuditableEntity {
    
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
    private String serviceName;
    
	@Column(nullable = false)
    private String variant;
    
	private Integer price;

//    @ManyToOne(targetEntity = Transaction.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "transaction_id", referencedColumnName = "id")
//    private Transaction transaction;
}
