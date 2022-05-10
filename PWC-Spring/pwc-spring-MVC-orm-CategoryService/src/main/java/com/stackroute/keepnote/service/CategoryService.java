package com.stackroute.keepnote.service;

import com.stackroute.keepnote.exception.CategoryDoesNoteExistsException;
import com.stackroute.keepnote.exception.CategoryNotCreatedException;
import com.stackroute.keepnote.exception.CategoryNotFoundException;
import com.stackroute.keepnote.model.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryService {
	

    void createCategory(Category category) throws CategoryNotCreatedException;

    boolean deleteCategory(int categoryId) throws CategoryDoesNoteExistsException;
    Optional getAllCategoryByUserId(int categoryId);
    List<Category> getAllCategory();//added extra method to check o/p
    boolean updateCategory(Category category, int categoryId);

}