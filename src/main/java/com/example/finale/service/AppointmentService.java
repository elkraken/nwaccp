package com.example.finale.service;

import java.util.List;
import com.example.finale.model.Appointment;



public interface AppointmentService {
		
		List<Appointment> getAllAppointments();
		
		void saveAppointment(Appointment appointment);
		
	    Appointment getAppointmentById(long id);
	    
	    void deleteAppointmentById(long id);
	}



