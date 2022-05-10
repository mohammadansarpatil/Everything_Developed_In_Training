package com.stackroute.keepnote.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	private String categoryName;
	private String categoryDescription;
	private String categoryCreatedBy;
	private Date categoryCreationDate;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public String getCategoryCreatedBy() {
		return categoryCreatedBy;
	}
	public void setCategoryCreatedBy(String categoryCreatedBy) {
		this.categoryCreatedBy = categoryCreatedBy;
	}
	public Date getCategoryCreationDate() {
		return categoryCreationDate;
	}
	public void setCategoryCreationDate(Date categoryCreationDate) {
		this.categoryCreationDate = categoryCreationDate;
	}
	public Category(String categoryName, String categoryDescription, String categoryCreatedBy,
			Date categoryCreationDate) {
		super();
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryCreatedBy = categoryCreatedBy;
		this.categoryCreationDate = categoryCreationDate;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", categoryDescription=" + categoryDescription
				+ ", categoryCreatedBy=" + categoryCreatedBy + ", categoryCreationDate=" + categoryCreationDate + "]";
	}
	
	

}