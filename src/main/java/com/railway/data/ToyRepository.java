package com.railway.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ToyRepository extends JpaRepository<Toy, String> {

//    @Query(value="SELECT * FROM toy WHERE user_id LIKE :user", nativeQuery = true)
    public Optional<Toy> findByUser_Id(String userId);
}
