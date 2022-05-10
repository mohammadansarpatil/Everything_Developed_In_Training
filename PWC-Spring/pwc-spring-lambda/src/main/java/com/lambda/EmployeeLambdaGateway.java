package com.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class EmployeeLambdaGateway implements RequestHandler<Object , Employee> {

	@Override
	public Employee handleRequest(Object input, Context context) {
		// TODO Auto-generated method stub
		Employee e = new Employee(1,"Ansar","Belgaum","ansar@email.com");
		System.out.println(e);
		return e;
	}

}
