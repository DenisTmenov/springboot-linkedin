package com.denis.learn.springboot.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.denis.learn.springboot.data.entity.Guest;
import com.denis.learn.springboot.data.repository.GuestRepository;

@RestController
@RequestMapping("api/guests")
public class GuestRestController
{
	@Autowired
	private GuestRepository guestRepository;

	@GetMapping
	public Iterable<Guest> getGuests()
	{
		return this.guestRepository.findAll();
	}
}
