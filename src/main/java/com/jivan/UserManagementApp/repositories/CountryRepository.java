package com.jivan.UserManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jivan.UserManagementApp.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
