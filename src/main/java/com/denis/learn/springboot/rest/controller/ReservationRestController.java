package com.denis.learn.springboot.rest.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.denis.learn.springboot.business.domain.RoomReservation;
import com.denis.learn.springboot.business.service.ReservationService;
import com.denis.learn.springboot.data.entity.Reservation;
import com.denis.learn.springboot.data.repository.ReservationRepository;
import com.denis.learn.springboot.utils.DateUtils;

@RestController
@RequestMapping("api/reservations")
public class ReservationRestController
{
	private final ReservationService reservationService;

	@Autowired
	public ReservationRestController(ReservationService reservationService)
	{
		this.reservationService = reservationService;
	}

	@GetMapping
	public List<RoomReservation> getRoomReservations(@RequestParam(name = "date", required = false) String dateString)
	{
		Date date = DateUtils.createDateFromDateString(dateString);
		return this.reservationService.getRoomReservationsForDate(date);
	}
}
