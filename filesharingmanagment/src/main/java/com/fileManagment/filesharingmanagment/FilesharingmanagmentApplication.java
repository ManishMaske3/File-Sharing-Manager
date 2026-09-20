package com.fileManagment.filesharingmanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FilesharingmanagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilesharingmanagmentApplication.class, args);
	}

}