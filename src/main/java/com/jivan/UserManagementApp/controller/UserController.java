package com.jivan.UserManagementApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jivan.UserManagementApp.entities.City;
import com.jivan.UserManagementApp.entities.Country;
import com.jivan.UserManagementApp.entities.State;
import com.jivan.UserManagementApp.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/getAllCountry")
	public ResponseEntity<List<Country>> getAllCountry() {
		List<Country> allCountries = this.userService.getAllCountries();
		return new ResponseEntity<List<Country>>(allCountries, HttpStatus.OK);
	}

	@GetMapping(value = "/getAllState/{countryId}")
	public ResponseEntity<List<State>> getAllState(@PathVariable Integer countryId) {
		List<State> allStates = this.userService.getAllStates(countryId);
		return new ResponseEntity<List<State>>(allStates, HttpStatus.OK);
	}

	@GetMapping(value = "/getAllCity/{stateId}")
	public ResponseEntity<List<City>> getAllCity(@PathVariable Integer stateId) {
		List<City> allCities = this.userService.getAllCities(stateId);
		return new ResponseEntity<List<City>>(allCities, HttpStatus.OK);
	}

}
