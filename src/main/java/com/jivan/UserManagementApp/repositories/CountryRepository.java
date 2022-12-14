package com.jivan.UserManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jivan.UserManagementApp.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
