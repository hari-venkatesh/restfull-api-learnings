package com.hari;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminResource {

	@GetMapping("admins")
	public List<Admin> getAdmins() {
		List<Admin> admins = new ArrayList<>();
		
		Admin a1 = new Admin();
		a1.setId(101);
		a1.setName("Hari");
		a1.setSalary(800000);
		
		Admin a2 = new Admin();
		a2.setId(102);
		a2.setName("HariMessi");
		a2.setSalary(900000);
		
		admins.add(a1);
		admins.add(a2);
		
		return admins;
	}
}
