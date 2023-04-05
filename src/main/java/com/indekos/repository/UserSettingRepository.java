package com.indekos.repository;

import com.indekos.model.User;
import com.indekos.model.UserSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSettingRepository extends JpaRepository<UserSetting, Long> {
	UserSetting findByUser (User user);
}
