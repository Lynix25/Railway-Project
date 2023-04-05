package com.indekos.repository;

import com.indekos.model.MasterRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<MasterRole, String> {
	
	MasterRole findByName(String roleName);
}
