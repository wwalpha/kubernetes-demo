package com.demo.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.demo.domain.Room;

@Repository
public interface RoomRepository extends PagingAndSortingRepository<Room, Long>, QuerydslPredicateExecutor<Room>{

}
