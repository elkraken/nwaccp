package com.example.finale.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.finale.model.Clinic;
import com.example.finale.service.ClinicService;


@Controller
public class ClinicController {

    @Autowired
    private ClinicService clinicService;
    
    
    
    public ClinicController(ClinicService clinicService) {
		super();
		this.clinicService = clinicService;
	}

	/*
    // display list of appointments
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listAppointments", clinicService.getAllAppointments());
        return "index";
    }
	*/
    
    @GetMapping("/showNewClinicForm")
    public String showNewClinicForm(Model model) {
        // create model attribute to bind form data
        Clinic clinic = new Clinic();
        model.addAttribute("clinic", clinic);
        return "new_clinic";
    }

    @PostMapping("/saveClinic")
    public String saveClinic(@ModelAttribute("clinic") Clinic clinic) {
        // save clinic to database
        clinicService.saveClinic(clinic);
        return "redirect:/";
    }

    @GetMapping("/showFormForClinicUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // get clinic from the service
        Clinic clinic = clinicService.getClinicById(id);

        // set clinic as a model attribute to pre-populate the form
        model.addAttribute("clinic", clinic);
        return "update_clinic";
    }

    @GetMapping("/deleteClinict/{id}")
    public String deleteClinic(@PathVariable(value = "id") long id) {

        // call delete clinic method 
        this.clinicService.deleteClinicById(id);
        return "redirect:/";
    }
}
