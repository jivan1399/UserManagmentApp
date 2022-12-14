package com.jivan.UserManagementApp.entities;

import javax.persistence.Column;

public class State {

	@Column(name = "State_Id")
	private Integer stateId;

	@Column(name = "State_Name")
	private String stateName;

	@Column(name = "Country_Id")
	private Integer countryId;

}
