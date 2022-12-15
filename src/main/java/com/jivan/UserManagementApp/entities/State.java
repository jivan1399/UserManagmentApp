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
@Table(name = "State_Details")
@Getter
@Setter
@NoArgsConstructor
@Data
public class State {

	@Id
	@Column(name = "State_Id")
	private Integer stateId;

	@Column(name = "State_Name")
	private String stateName;

	@Column(name = "Country_Id")
	private Integer countryId;

}
