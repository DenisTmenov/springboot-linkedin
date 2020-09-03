package com.denis.learn.springboot.business.domain;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RoomReservation
{
	private long roomId;
	private long guestId;
	private String roomName;
	private String roomNumber;
	private String firstName;
	private String lastName;
	private Date date;
}
