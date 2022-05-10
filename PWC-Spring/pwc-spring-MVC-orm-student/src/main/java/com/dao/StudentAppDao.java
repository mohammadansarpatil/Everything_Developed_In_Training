package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public interface StudentAppDao extends CrudRepository<Student, Integer>{

}
