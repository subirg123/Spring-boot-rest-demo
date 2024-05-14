package com.subir.restdemo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.subir.restdemo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{
}
