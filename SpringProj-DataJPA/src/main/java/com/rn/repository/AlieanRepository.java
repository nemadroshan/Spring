package com.rn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rn.model.Alien;

public interface AlieanRepository extends JpaRepository<Alien, Integer> {

}
