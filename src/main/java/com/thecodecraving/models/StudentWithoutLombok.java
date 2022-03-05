package com.thecodecraving.models;

import java.util.List;
import java.util.Objects;

public class StudentWithoutLombok {
	
	private Integer rollNo;
	private String firstName;
	private String lastName;
	private List<String> subjects;
	private Double percentage;
	private String address;
	
	public StudentWithoutLombok() {
		
	}

	public StudentWithoutLombok(Integer rollNo, String firstName, String lastName, List<String> subjects,
			Double percentage, String address) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.subjects = subjects;
		this.percentage = percentage;
		this.address = address;
	}

	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(address, firstName, lastName, percentage, rollNo, subjects);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentWithoutLombok other = (StudentWithoutLombok) obj;
		return Objects.equals(address, other.address) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(percentage, other.percentage)
				&& Objects.equals(rollNo, other.rollNo) && Objects.equals(subjects, other.subjects);
	}

	@Override
	public String toString() {
		return "StudentWithoutLombok [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", subjects=" + subjects + ", percentage=" + percentage + ", address=" + address + "]";
	}
	
	
}
