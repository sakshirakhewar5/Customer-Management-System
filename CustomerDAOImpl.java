package com.SunBaseData.SunBaseDataAssesment.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SunBaseData.SunBaseDataAssesment.POJO.Customer;

import jakarta.persistence.EntityManager;


@Repository
public class CustomerDAOImpl implements CustomerDAO{
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Customer> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
		List<Customer> list = query.getResultList();
		return list;
	}

	@Override
	public Customer get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Customer customerObj = currentSession.get(Customer.class, id);
		return customerObj;
	}

	@Override
	public void save(Customer cutomer) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(cutomer);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Customer customerObj = currentSession.get(Customer.class, id);
		currentSession.delete(customerObj);
	}

	
}
