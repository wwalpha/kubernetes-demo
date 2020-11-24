package com.demo.admin.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.bean.HotelSearch;
import com.demo.domain.Hotel;
import com.demo.repository.HotelRepository;

@Controller
public class HotelController {

	private HotelRepository hotelRepo;

	public HotelController(HotelRepository hotelRepo) {
		this.hotelRepo = hotelRepo;
	}

	@GetMapping(value = "/admin")
	public String getHotels(Model model) {
		List<Hotel> results = StreamSupport.stream(hotelRepo.findAll().spliterator(), false)
				.collect(Collectors.toList());

		model.addAttribute("hotels", results);

		return "/admin/hotel/list";
	}

	@PostMapping(value = "/admin/hotel/search")
	public String search(@RequestParam("name") String hotelName, Model model) {
		List<Hotel> results = new ArrayList<Hotel>();

		// 検索条件なし
		if (StringUtils.isEmpty(hotelName)) {
			results = StreamSupport.stream(hotelRepo.findAll().spliterator(), false).collect(Collectors.toList());
		} else {
			// 検索条件あり
			results = hotelRepo.findByName(hotelName);
		}

		// データ保存
		model.addAttribute("hotels", results);

		return "/admin/hotel/list";
	}

	@GetMapping(value = "/admin/hotel/detail")
	public String getHotel(HotelSearch searchBean) {

		return "/hotel/hotels";
	}

	@PostMapping(value = "/admin/hotel/regist")
	public String regist(Hotel hotel) {

		// regist new entity
		Hotel entity = new Hotel();
		entity.setName(hotel.getName());
		entity.setStars(hotel.getStars());

		hotelRepo.save(entity);

		return "/admin/hotel/list";
	}
}
