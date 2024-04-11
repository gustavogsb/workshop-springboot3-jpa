package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
//import com.educandoweb.course.services.exceptions.DatabaseException;
//import com.educandoweb.course.services.exceptions.ResourceNotFoundException;
import com.educandoweb.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		//return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

}
