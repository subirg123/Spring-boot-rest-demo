package com.subir.restdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subir.restdemo.model.CloudVendor;
import com.subir.restdemo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController { 
	
	CloudVendorService cloudVendorService;
	
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}

	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		
		return cloudVendorService.getCloudVendor(vendorId);		
	}
	
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails() {
		
		return cloudVendorService.getAllCloudVendors();		
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		
		cloudVendorService.createCloudVendor(cloudVendor);
		return "vendor created successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "vendor updated successfully";
	}
	
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable ("vendorId") String vendorId) {
		
		cloudVendorService.deleteCloudVendor(vendorId);
		return "vendor deleted successfully";
	}
}
