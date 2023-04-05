package com.indekos.repository;

import com.indekos.model.User;
import com.indekos.model.UserDocument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDocumentRepository extends JpaRepository<UserDocument, String> {
	List<UserDocument> findByUser(User user);
}
