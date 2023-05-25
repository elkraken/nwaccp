package com.example.finale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.finale.model.AppointmentCountView;
import com.example.finale.repository.AppointmentCountViewRepository;





@Service
public class AppointmentCountViewServiceImpl implements AppointmentCountViewService{
	
	@Autowired
	private AppointmentCountViewRepository appointmentCountViewRepository;
	
	@Override
	public List < AppointmentCountView > getAllAppointmentCountViews() {		
		return appointmentCountViewRepository.findAll();
	}
	
	
	
	/*
	@Override
    public void saveAppointmentCountView(AppointmentCountView appointment) {
        this.appointmentCountViewRepository.save(appointmentCountView);
    }
	*/
	
	
    @Override
    public AppointmentCountView getAppointmentCountViewById(long id) {
        Optional < AppointmentCountView > optional = appointmentCountViewRepository.findById(id);
        AppointmentCountView appointmentCountView = null;
        if (optional.isPresent()) {
            appointmentCountView = optional.get();
        } else {
            throw new RuntimeException(" AppointmentCountView not found for id :: " + id);
        }
        return appointmentCountView;
    }
    /*
    @Override
    public void deleteAppointmentCountViewById(long id) {
        this.appointmentCountViewRepository.deleteById(id);
    }
    */
    
}

