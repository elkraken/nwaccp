package com.example.finale.service;

import java.util.List;

import com.example.finale.model.Clinic;




public interface ClinicService {
		
		List<Clinic> getAllClinics();
		
		void saveClinic(Clinic clinic);
		
	    Clinic getClinicById(long id);
	    
	    void deleteClinicById(long id);
	}



