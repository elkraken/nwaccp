package com.example.finale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.finale.model.Appointment;
import com.example.finale.repository.AppointmentRepository;




@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Override
	public List < Appointment > getAllAppointments() {		
		//return appointmentRepository.findAll();
		return appointmentRepository.findAll(Sort.by(Sort.Direction.ASC, "dateStr"));
	}
	

	
	

	@Override
    public void saveAppointment(Appointment appointment) {
        this.appointmentRepository.save(appointment);
    }

    @Override
    public Appointment getAppointmentById(long id) {
        Optional < Appointment > optional = appointmentRepository.findById(id);
        Appointment appointment = null;
        if (optional.isPresent()) {
            appointment = optional.get();
        } else {
            throw new RuntimeException(" Appointment not found for id :: " + id);
        }
        return appointment;
    }

    @Override
    public void deleteAppointmentById(long id) {
        this.appointmentRepository.deleteById(id);
    }
}

