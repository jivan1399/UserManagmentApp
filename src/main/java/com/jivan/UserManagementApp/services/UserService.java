package com.jivan.UserManagementApp.services;

import java.util.List;

import com.jivan.UserManagementApp.entities.City;
import com.jivan.UserManagementApp.entities.Country;
import com.jivan.UserManagementApp.entities.State;

public interface UserService {

	List<Country> getAllCountries();

	List<State> getAllStates(Integer countryId);

	List<City> getAllCities(Integer stateId);

}
