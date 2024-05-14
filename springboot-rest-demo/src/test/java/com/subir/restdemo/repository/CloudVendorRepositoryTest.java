package com.subir.restdemo.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.subir.restdemo.model.CloudVendor;

@DataJpaTest
public class CloudVendorRepositoryTest {
		
	@Autowired
	private CloudVendorRepository cloudVendorRepository;	
	CloudVendor cloudVendor;
	
	@BeforeEach
	void setUp() {
		cloudVendor = new CloudVendor("1","Amazon","USA","xxx");
		cloudVendorRepository.save(cloudVendor); 
	}
	
	@AfterEach
	void tearDown() {
		cloudVendor=null;
		cloudVendorRepository.deleteAll();
	}
	
	// test case success
	
	
	
	// test case failure
	
	
	
}
