package com.thecodecraving.models;

import java.util.Objects;



public class AuthorWithoutLombok {
	
	private final int id;
	 private final String name;
	 private final String surname;
	 
	 
	public AuthorWithoutLombok(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getSurname() {
		return surname;
	}


	@Override
	public String toString() {
		return "AuthorWithoutLombok [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name, surname);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthorWithoutLombok other = (AuthorWithoutLombok) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}


	 
}
