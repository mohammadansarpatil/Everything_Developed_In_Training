package com.stackroute.keepnote.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.keepnote.exception.CategoryDoesNoteExistsException;
import com.stackroute.keepnote.exception.CategoryNotCreatedException;
import com.stackroute.keepnote.exception.CategoryNotFoundException;
import com.stackroute.keepnote.model.Category;
import com.stackroute.keepnote.repository.CategoryRepository;

/*
* Service classes are used here to implement additional business logic/validation 
* This class has to be annotated with @Service annotation.
* @Service - It is a specialization of the component annotation. It doesn't currently 
* provide any additional behavior over the @Component annotation, but it's a good idea 
* to use @Service over @Component in service-layer classes because it specifies intent 
* better. Additionally, tool support and additional behavior might rely on it in the 
* future.
* */
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository catRepo;
	List<Category> lst = new ArrayList<Category>();
	
	public void createCategory(Category category) throws CategoryNotCreatedException {
		catRepo.save(category);
		
		System.out.println(lst);
	}


	public Optional getAllCategoryByUserId(int categoryId) {
		Optional opt = catRepo.findById(categoryId);
		//if(opt.isPresent()) 
		return opt;
	}
	
	public boolean deleteCategory(int id) {
		Optional opt = catRepo.findById(id);
		if(opt.isPresent()) {
			catRepo.deleteById(id);
			return true;
		}
		return false;
	}
	public boolean updateCategory(Category cat , int id) {
		Optional<Category> opt = catRepo.findById(id);
		if(opt.isPresent()) {
			catRepo.deleteById(id);
			catRepo.save(cat);
			return true;
		}
		return false;
	}


	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		List<Category> lst = (List<Category>) catRepo.findAll();
		return lst;
	}

}