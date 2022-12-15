package com.jivan.UserManagementApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jivan.UserManagementApp.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{
	
	List<City> findByStateId(Integer stateId);

}
