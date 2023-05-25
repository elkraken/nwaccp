package com.example.finale.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
	@Table(name = "clinics", schema = "nwaccp")
	public class Clinic {
		
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
		
		@Column(name = "capacity")
		private Integer clinicCapacity;
		
		@Column(name = "date")
		private Date date;
		
		
		public Clinic() {};
		public Clinic(long id, String month, String day, String year, String dateStr, Integer clinicCapacity,
				Date date) {
			super();
			this.id = id;
			this.month = month;
			this.day = day;
			this.year = year;
			this.dateStr = dateStr;
			this.clinicCapacity = clinicCapacity;
			this.date = date;
		}

		/*
		@OneToMany()
		@JoinColumn(name = "date_str")
		private Appointment appointment;
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

		public Integer getClinicCapacity() {
			return clinicCapacity;
		}

		public void setClinicCapacity(Integer clinicCapacity) {
			this.clinicCapacity = clinicCapacity;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}		
		
		

}
