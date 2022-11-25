package com.hari;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminResource {
	
	@Autowired
	AdminRepo repo;

	@GetMapping("admins")
	public List<Admin> getAdmins() {
		List<Admin> admins = (List<Admin>) repo.findAll();
		return admins;
	}
}
