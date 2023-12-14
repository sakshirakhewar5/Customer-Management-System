package com.SunBaseData.SunBaseDataAssesment.Service;

import java.util.List;

import com.SunBaseData.SunBaseDataAssesment.POJO.Customer;

public interface CustomerService {
	List<Customer> get();
	
	Customer get(int id);
	
	void save(Customer customer);
	
	void delete(int id);

	
}
