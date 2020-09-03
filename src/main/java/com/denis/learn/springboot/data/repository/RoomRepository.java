package com.denis.learn.springboot.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.denis.learn.springboot.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>
{
}
