package com.SunBaseData.SunBaseDataAssesment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SunBaseData.SunBaseDataAssesment.DAO.CustomerDAO;
import com.SunBaseData.SunBaseDataAssesment.POJO.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDAO customerDAO;
	
	@Transactional
	@Override
	public List<Customer> get() {
		return customerDAO.get();
	}

	@Transactional
	@Override
	public Customer get(int id) {
		return customerDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Customer customer) {
		customerDAO.save(customer);
	}

	@Transactional
	@Override
	public void delete(int id) {
		customerDAO.delete(id);
	}

}
