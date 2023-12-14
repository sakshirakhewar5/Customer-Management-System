package com.SunBaseData.SunBaseDataAssesment.DAO;

import java.util.List;

import com.SunBaseData.SunBaseDataAssesment.POJO.Customer;

public interface CustomerDAO {
List<Customer> get();
	
	Customer get(int id);
	
	void save(Customer customer);
	
	void delete(int id);
}
