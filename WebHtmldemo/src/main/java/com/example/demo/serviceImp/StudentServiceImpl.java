package com.example.demo.serviceImp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.reposirtory.StudentRepository;
import com.example.demo.services.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repository;
	
	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public String deleteStudent(Student student) {
		// TODO Auto-generated method stub
		repository.delete(student);
		return "delete done";
	}

}
