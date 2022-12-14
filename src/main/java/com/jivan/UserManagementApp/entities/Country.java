package com.jivan.UserManagementApp.entities;

import javax.persistence.Column;

public class Country {

	@Column(name = "Country_Id")
	private Integer countryId;

	@Column(name = "Country_Name")
	private String countryName;

}
