package com.thecodecraving.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentWithLombok {
	
	
	private Integer rollNo;
	@EqualsAndHashCode.Exclude
	private String firstName;
	
	private String lastName;
	private List<String> subjects;
	private Double percentage;
	private String address;

}
