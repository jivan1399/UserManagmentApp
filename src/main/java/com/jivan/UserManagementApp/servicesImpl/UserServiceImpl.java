package com.jivan.UserManagementApp.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jivan.UserManagementApp.entities.City;
import com.jivan.UserManagementApp.entities.Country;
import com.jivan.UserManagementApp.entities.State;
import com.jivan.UserManagementApp.repositories.CityRepository;
import com.jivan.UserManagementApp.repositories.CountryRepository;
import com.jivan.UserManagementApp.repositories.StateRepository;
import com.jivan.UserManagementApp.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private StateRepository stateRepository;

	@Override
	public List<Country> getAllCountries() {
		return this.countryRepository.findAll();
	}

	@Override
	public List<State> getAllStates(Integer countryId) {
		return this.stateRepository.findByCountryId(countryId);
	}

	@Override
	public List<City> getAllCities(Integer stateId) {
		List<City> allCitiesByState = this.cityRepository.findByStateId(stateId);
		return allCitiesByState;
	}
}
