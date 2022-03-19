package com.thecodecraving.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ResourceCleanupWithoutLombok {
	
	
	
	public void manualResourceCleanUp() {
		Scanner scanner = null;
		try {
		    scanner = new Scanner(new File("test.txt"));
		    while (scanner.hasNext()) {
		        System.out.println(scanner.nextLine());
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} finally {
			//closing the resource manually, to prevent memory leaks
		    if (scanner != null) {
		        scanner.close();
		    }
		}
		
	}
	
	public void tryWithResourceCleanUp() throws IOException {
		try (Scanner scanner = new Scanner(new File("test.txt"))) {
		    while (scanner.hasNext()) {
		        System.out.println(scanner.nextLine());
		    }
		} catch (FileNotFoundException fnfe) {
		    fnfe.printStackTrace();
		}
	}

}
