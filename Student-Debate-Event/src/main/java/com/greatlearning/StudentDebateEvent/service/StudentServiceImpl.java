package com.greatlearning.StudentDebateEvent.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.greatlearning.StudentDebateEvent.entity.Student;
import com.greatlearning.StudentDebateEvent.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		List<Student> books = studentRepository.findAll();
		return books;
	}

	@Override
	public Student findById(int theId) {

		return studentRepository.findById(theId).get();
	}

	@Override
	public void save(Student theStudent) {
		studentRepository.save(theStudent);

	}

	@Override
	public void deleteById(int theId) {
		studentRepository.deleteById(theId);
	}
}