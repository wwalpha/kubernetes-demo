package com.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Hotel")
public class Hotel {

	@Getter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Getter
	@Setter
	@Column(name = "name", nullable = false)
	private String name;

	@Getter
	@Setter
	@Column(name = "stars", nullable = false)
	private int stars;

	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
	// Stop bidirectional relationship which cause a cycle.
	@JsonIgnore
	@Getter
	private Set<Room> rooms;
}
