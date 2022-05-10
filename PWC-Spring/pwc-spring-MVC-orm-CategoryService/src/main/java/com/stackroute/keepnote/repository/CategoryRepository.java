package com.stackroute.keepnote.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.keepnote.model.Category;



@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

	
}