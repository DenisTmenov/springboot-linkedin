package com.denis.learn.springboot.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.denis.learn.springboot.data.entity.Room;
import com.denis.learn.springboot.data.repository.RoomRepository;

@RestController
@RequestMapping("api/rooms")
public class RoomRestController
{
	@Autowired
	private RoomRepository roomRepository;

	@GetMapping
	public Iterable<Room> getRooms()
	{
		return this.roomRepository.findAll();
	}

}
