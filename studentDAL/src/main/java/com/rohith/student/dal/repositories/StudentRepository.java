package com.rohith.student.dal.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rohith.student.dal.entities.student;


public interface StudentRepository extends CrudRepository<student, Long> {

}
