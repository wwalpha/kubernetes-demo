package com.demo.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "Room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name="hotel_id", nullable=false)
	private Hotel hotel;

	@NaturalId
	@Column(name = "room_no", nullable = false, unique = true)
	private String roomNo;

	@Column(name = "room_type", nullable = false)
	@Enumerated(EnumType.STRING)
	private RoomType roomType;

	@Column(name = "beds", nullable = false)
	private int beds;

	@Column(name = "cost", nullable = false)
	private BigDecimal costPerNight;

}
