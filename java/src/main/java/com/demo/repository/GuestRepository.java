package com.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.domain.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
