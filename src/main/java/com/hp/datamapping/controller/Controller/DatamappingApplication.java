package com.hp.datamapping.controller.Controller;

import Model.AWSDataLabel;
import Model.AzureDataLabel;
import Model.GCPDataLabel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan({"com.hp"})
public class DatamappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatamappingApplication.class, args);
	}

	@GetMapping(value = "/getlabelaws")
	public AWSDataLabel GetAWSLabels () {
		return new AWSDataLabel();
	}

	@GetMapping(value = "/getlabelazure")
	public AzureDataLabel GetAzureLabels () {
		return new AzureDataLabel();
	}

	@GetMapping(value = "/getlabelgcp")
	public GCPDataLabel GetGCPLables () {
		return new GCPDataLabel();
	}

	@GetMapping(value = "/test")
	public String Test() {
		return "TESTINGGGGG";
	}
}
