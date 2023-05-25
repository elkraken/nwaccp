package com.example.finale.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointments", schema = "nwaccp")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	
	@Column(name = "month")
	private String month;
	
	@Column(name = "day")
	private String day;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "date_str")
	private String dateStr;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "organization")
	private String organizationName;
	
	@Column(name = "number_of_cats")
	private Integer numberOfCats;
	
	@Column(name = "contact_first_name")
	private String contactFirstName;
	
	@Column(name = "contact_last_name")
	private String contactLastName;
	
	@Column(name = "phone")
	private String phone;
	
	
	
	public Appointment(){};
	
	public Appointment(long id, String month, String day, String year, String dateStr, Date date,
			String organizationName, Integer numberOfCats, String contactFirstName, String contactLastName,
			String phone) {
		super();
		this.id = id;
		this.month = month;
		this.day = day;
		this.year = year;
		this.dateStr = dateStr;
		this.date = date;
		this.organizationName = organizationName;
		this.numberOfCats = numberOfCats;
		this.contactFirstName = contactFirstName;
		this.contactLastName = contactLastName;
		this.phone = phone;
	}
	


	/*
	@ManyToOne()
	@JoinColumn(name = "date_str")
	private Clinic clinic;
	*/
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public Integer getNumberOfCats() {
		return numberOfCats;
	}

	public void setNumberOfCats(Integer numberOfCats) {
		this.numberOfCats = numberOfCats;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
	
	