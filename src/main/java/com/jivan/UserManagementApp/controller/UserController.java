package com.jivan.UserManagementApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jivan.UserManagementApp.entities.City;
import com.jivan.UserManagementApp.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/getAllCity/{stateId}")
	public ResponseEntity<List<City>> getAllCity(@PathVariable Integer stateId) {
		List<City> allCities = this.userService.getAllCities(stateId);
		return new ResponseEntity<List<City>>(allCities, HttpStatus.OK);
	}

}
