package com.example.alumni.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "alumni_db")
public class Alumni {
    
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String university;
	    private int passoutYear;
	    private String location;
	    private String linkedinHeadline;

	    @Column(name = "\"current_role\"")
	    private String currentRole;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUniversity() {
			return university;
		}

		public void setUniversity(String university) {
			this.university = university;
		}

		public int getPassoutYear() {
			return passoutYear;
		}

		public void setPassoutYear(int passoutYear) {
			this.passoutYear = passoutYear;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getLinkedinHeadline() {
			return linkedinHeadline;
		}

		public void setLinkedinHeadline(String linkedinHeadline) {
			this.linkedinHeadline = linkedinHeadline;
		}

		public String getCurrentRole() {
			return currentRole;
		}

		public void setCurrentRole(String currentRole) {
			this.currentRole = currentRole;
		}
	    
	    
}
