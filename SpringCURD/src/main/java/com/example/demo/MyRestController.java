package com.example.demo;
import java.util.List;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestController {

	@Autowired
	PersonResority repo;
	  @GetMapping(value = { "/api/", "/api/{id}" })
	    public Person getDefaultEmployeesByIdWithOptional(@PathVariable Optional<Long> id) {
	        Person p=new Person();
	        if (id.isPresent()) {
	            p= repo.findById(id.get()).get();            
	            return p;

	        } else {
	            return p;
	        }
	    }
	@GetMapping("/")
	public List<Person> getallDetails()
	{
	return repo.findAll();
	}

	@PostMapping("/")
	public Person saveDetails(@RequestBody Person person)
	{
	return repo.save(person);
	}

	@PutMapping("/")
	public Person updateDetails(@RequestBody Person person)
	{
	return repo.save(person);
	}

	@DeleteMapping("/")
	public String deleteDetails(@RequestBody Person person)
	{
	repo.deleteAll();
	return "Delete Successfully";
	}
}
