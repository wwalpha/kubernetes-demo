package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.domain.Hotel;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {

	@Query("select h from Hotel h where h.name = :name")
	List<Hotel> findByName(@Param("name") String name);
}
