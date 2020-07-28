package com.rn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rn.entity.Alien;



public interface AlieanRepository extends JpaRepository<Alien, Integer> {

	//by query dsl
	Alien findByAname(String name);

	//by query annotation
	@Query("from Alien where aname = :name")
	List<Alien> find(@Param(value = "name")String aname);
}
