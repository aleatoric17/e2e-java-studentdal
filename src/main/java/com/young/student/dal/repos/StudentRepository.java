package com.young.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.young.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
