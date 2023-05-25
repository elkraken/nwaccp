package com.example.finale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.finale.model.AppointmentCountView;


@Repository
public interface AppointmentCountViewRepository extends JpaRepository <AppointmentCountView, Long>{
	

}
