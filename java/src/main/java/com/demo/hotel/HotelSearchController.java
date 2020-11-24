package com.demo.hotel;

import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.bean.HotelSearch;
import com.demo.exceptions.NotFoundException;
import com.demo.repository.HotelRepository;
import com.demo.repository.RoomRepository;

public class HotelSearchController {

	private HotelRepository hotelRepo;
	private RoomRepository roomRepo;

	public HotelSearchController(HotelRepository hotelRepo, RoomRepository roomRepo) {
		this.hotelRepo = hotelRepo;
		this.roomRepo = roomRepo;
	}

	@PostMapping(value = "/hotel/search")
	public String getHotels(HotelSearch searchBean) {
//		hotelRepo.findHotels();
//		Page<Hotel> results = hotelRepository.findHotels(state, suburb, postcode)(state, suburb, postcode, pageable);
		
//		model.addAttribute("hotels", results == null ? Page.empty() : results);
		
		return "/hotel/hotels";
	}

	@GetMapping(value = "/hotel/{id}/rooms")
	public String getHotelRooms(@PathVariable("id") Long id, Pageable pageable, Model model) throws NotFoundException {
//		Hotel hotel = hotelRepository.findById(id).orElseThrow(NotFoundException::new);
//		
//		Page<Room> availableRooms = roomRepository.findAll(RoomPredicates.availableRoom(id), pageable);
//		model.addAttribute("rooms", availableRooms);
//		model.addAttribute("hotel", hotel);
		
		return "/hotel/rooms";
	}
}
