package com.example.finale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.finale.model.Clinic;
import com.example.finale.repository.ClinicRepository;




@Service
public class ClinicServiceImpl implements ClinicService{
	
	@Autowired
	private ClinicRepository clinicRepository;
	
	@Override
	public List < Clinic > getAllClinics() {		
		return clinicRepository.findAll();
	}
	

	
	

	@Override
    public void saveClinic(Clinic clinic) {
        this.clinicRepository.save(clinic);
    }

    @Override
    public Clinic getClinicById(long id) {
        Optional < Clinic > optional = clinicRepository.findById(id);
        Clinic clinic = null;
        if (optional.isPresent()) {
            clinic = optional.get();
        } else {
            throw new RuntimeException(" Clinic not found for id :: " + id);
        }
        return clinic;
    }

    @Override
    public void deleteClinicById(long id) {
        this.clinicRepository.deleteById(id);
    }
}

