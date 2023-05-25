package com.example.finale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finale.model.Clinic;


@Repository
public interface ClinicRepository extends JpaRepository <Clinic, Long>{
	

}
