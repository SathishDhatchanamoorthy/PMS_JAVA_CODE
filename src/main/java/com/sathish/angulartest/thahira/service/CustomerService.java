package com.sathish.angulartest.thahira.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.thahira.entity.CustomerMaster;
import com.sathish.angulartest.thahira.repository.CustomerRepository;
import com.sathish.angulartest.thahira.response.Response;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerrepository;
	
	
	 public Response saveCustomer(CustomerMaster customer) {
	         customerrepository.save(customer);
	         return new Response(1,"success",customer,true);
	    }
	 
	 
	 
	 
	 public List<CustomerMaster> getAllCustomers() {
	        return (List<CustomerMaster>) customerrepository.findAll();
	    }


	 
	 
	 public Optional<CustomerMaster> getCustomerById(Long customerId) {
	        return customerrepository.findById(customerId);
	  }
	 
	 
	 
	 
	 public Response updateCustomer(Long customerId, CustomerMaster updatedCustomer) {
	        if (customerrepository.existsById(customerId)) {
	            updatedCustomer.setCustomerId(customerId);
	            customerrepository.save(updatedCustomer);
	            return new Response(1,"success",updatedCustomer,true);
	        } else {
	            return new Response(2,"error",updatedCustomer,false);
	        }
	    }
	 
	 
	 
	 public String deleteCustomer(Long customerId) {
		 if (customerrepository.existsById(customerId)) {
	        customerrepository.deleteById(customerId);
	        return "Deleted Successfully";
	        }
		 else {
			 return "Failed To Delete";
		 }
	    }
}