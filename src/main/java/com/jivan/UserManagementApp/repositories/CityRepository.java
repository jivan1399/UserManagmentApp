package com.jivan.UserManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jivan.UserManagementApp.entities.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
