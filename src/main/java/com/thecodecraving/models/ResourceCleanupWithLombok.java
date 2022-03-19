package com.thecodecraving.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import lombok.Cleanup;

public class ResourceCleanupWithLombok {
	
	
	public void cleanUpResource() throws FileNotFoundException {
		@Cleanup Scanner scanner = new Scanner(new File("test.txt"));
		while (scanner.hasNext()) {
	        System.out.println(scanner.nextLine());
	    }
	}
	
	
}
