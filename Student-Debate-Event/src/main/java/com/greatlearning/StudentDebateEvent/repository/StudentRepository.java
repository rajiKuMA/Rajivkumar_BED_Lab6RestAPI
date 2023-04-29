package com.greatlearning.StudentDebateEvent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.StudentDebateEvent.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
