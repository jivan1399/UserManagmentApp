package com.jivan.UserManagementApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "City_Details")
@Getter
@Setter
@NoArgsConstructor
@Data
public class City {

	@Id
	@Column(name = "City_Id")
	private Integer cityId;

	@Column(name = "City_Name")
	private String cityName;

	@Column(name = "State_Id")
	private Integer stateId;

}
