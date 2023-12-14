package com.SunBaseData.SunBaseDataAssesment.Controller;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SunBaseData.SunBaseDataAssesment.POJO.Customer;
import com.SunBaseData.SunBaseDataAssesment.Service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	SessionFactory sf;
	
	@RequestMapping("cutomerdeatil")
	public String add() {
		return "addcustomer";
	}
	@RequestMapping("/addcustomer")
	public String addcust(Customer customer) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(customer);
		t.commit();
		return "addcustomer";
	}
	

	@Autowired
	private CustomerService customerService;
		
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("customerList");
		List<Customer> list = customerService.get();
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping("/openCustomerView")
	public ModelAndView openEmployeeAddView() {
		ModelAndView mav = new ModelAndView("addcustomer");
		mav.addObject("customer", new Customer());
		return mav;
	}
	
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute("customer") Customer customerObj) {
		ModelAndView mav = new ModelAndView("customerList");
		customerService.save(customerObj);
		List<Customer> list = customerService.get();
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping("/employee/{id}")
	public ModelAndView get(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("addcustomer");
		Customer employeeObj = customerService.get(id);
		if(employeeObj == null) {
			throw new RuntimeException("Customer not found"+id);
		}
		mav.addObject("customer", employeeObj);
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("customerList");
		customerService.delete(id);
		List<Customer> list = customerService.get();
		mav.addObject("list", list);
		return mav;
	}
}
