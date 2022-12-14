package com.jivan.UserManagementApp.entities;

import javax.persistence.Column;

public class City {
	
	@Column(name = "City_Id")
	private Integer cityId;
	
	@Column(name = "City_Name")
	private String cityName;
	
	@Column(name = "State_Id")
	private Integer stateId;

}
