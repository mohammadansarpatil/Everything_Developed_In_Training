package com.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "This is the Department Model")
public class Department {
	
	@ApiModelProperty(notes="This is Department Name")
	private String departmentName;
	@ApiModelProperty(notes="This is Manager Name")
	private String managerName;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", managerName=" + managerName + "]";
	}
	public Department(String departmentName, String managerName) {
		super();
		this.departmentName = departmentName;
		this.managerName = managerName;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
