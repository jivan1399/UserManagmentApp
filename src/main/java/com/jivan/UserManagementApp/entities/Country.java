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
@Table(name = "Country_Details")
@Getter
@Setter
@NoArgsConstructor
@Data
public class Country {

	@Id
	@Column(name = "Country_Id")
	private Integer countryId;

	@Column(name = "Country_Name")
	private String countryName;

}
