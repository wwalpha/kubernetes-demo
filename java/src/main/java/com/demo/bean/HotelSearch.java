package com.demo.bean;

import lombok.Getter;
import lombok.Setter;

public class HotelSearch {

	@Getter
	@Setter
	private String hotelName;
	
	@Getter
	@Setter
	/**	Start Date */
	private String start;
	
	@Getter
	@Setter
	/**	End Date */
	private String end;
}
