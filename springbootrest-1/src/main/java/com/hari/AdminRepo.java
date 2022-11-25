package com.hari;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AdminRepo extends CrudRepository<Admin, Integer> {

	List<Admin> findAll();
	

}
