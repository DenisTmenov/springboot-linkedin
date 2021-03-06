package com.denis.learn.springboot.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "GUEST")
public class Guest
{
	@Id
	@Column(name = "GUEST_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long guestId;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "STATE")
	private String state;
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
}
