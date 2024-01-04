package com.sathish.angulartest.thahira.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.thahira.entity.CustomerMaster;
import com.sathish.angulartest.thahira.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerrepository;
	
	 public String saveCustomer(CustomerMaster customer) {
	         customerrepository.save(customer);
	         return "inserted Successfully";
	    }
	 
	 public List<CustomerMaster> getAllCustomers() {
	        return (List<CustomerMaster>) customerrepository.findAll();
	    }


	 public Optional<CustomerMaster> getCustomerById(Long customerId) {
	        return customerrepository.findById(customerId);
	  }
	 
	 public String updateCustomer(Long customerId, CustomerMaster updatedCustomer) {
	        if (customerrepository.existsById(customerId)) {
	            updatedCustomer.setCustomerId(customerId);
	            customerrepository.save(updatedCustomer);
	            return "updated successfully";
	        } else {
	            return "Failed To Update";
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
