package com.jivan.UserManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jivan.UserManagementApp.entities.State;

public interface StateRepository extends JpaRepository<State, Integer> {

}
