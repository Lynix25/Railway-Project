package com.indekos.dto.response;

import com.indekos.dto.AccountDTO;
import com.indekos.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class UserResponse {
	
	private User user;
	private AccountDTO account;
	private List<UserDocumentResponse> userDocuments;
}
