package com.indekos.repository;

import com.indekos.model.ContactAblePerson;
import com.indekos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactAblePersonRepository extends JpaRepository<ContactAblePerson, String>{
	ContactAblePerson findByUserAndId(User user, String id);
	List<ContactAblePerson> findByUserAndIsDeleted(User user, boolean isDeleted);
}
