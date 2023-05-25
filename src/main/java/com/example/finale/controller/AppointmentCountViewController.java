package com.example.finale.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.finale.model.Appointment;
import com.example.finale.service.AppointmentCountViewService;
import com.example.finale.service.AppointmentService;


@Controller
public class AppointmentCountViewController {

    @Autowired
    private AppointmentCountViewService appointmentCountViewService;

    // display list of appointmentCountViews
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listAppointmentCountView", appointmentCountViewService.getAllAppointmentCountViews());
        return "index";
    }
    /*
    @GetMapping("/showNewAppointmentForm")
    public String showNewAppointmentForm(Model model) {
        // create model attribute to bind form data
        Appointment appointment = new Appointment();
        model.addAttribute("appointment", appointment);
        return "new_appointment";
    }
	
    
    @PostMapping("/saveAppointment")
    public String saveAppointment(@ModelAttribute("appointment") Appointment appointment) {
        // save appointment to database
        appointmentService.saveAppointment(appointment);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // get appointment from the service
        Appointment appointment = appointmentService.getAppointmentById(id);

        // set appointment as a model attribute to pre-populate the form
        model.addAttribute("appointment", appointment);
        return "update_appointment";
    }

    @GetMapping("/deleteAppointment/{id}")
    public String deleteAppointment(@PathVariable(value = "id") long id) {

        // call delete appointment method 
        this.appointmentService.deleteAppointmentById(id);
        return "redirect:/";
    }
    */
}
