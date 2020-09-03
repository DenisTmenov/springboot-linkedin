package com.denis.learn.springboot.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.denis.learn.springboot.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long>
{
}
