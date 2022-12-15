package com.jivan.UserManagementApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jivan.UserManagementApp.entities.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

	List<State> findByCountryId(Integer countryId);

}
