package com.example.finale.service;

import java.util.List;
import com.example.finale.model.AppointmentCountView;



public interface AppointmentCountViewService {
		
		List<AppointmentCountView> getAllAppointmentCountViews();
		
		//void saveAppointmentCountView(AppointmentCountView appointmentCountView);
		
	    AppointmentCountView getAppointmentCountViewById(long id);
	    
	    //void deleteAppointmentCountViewById(long id);
	}



