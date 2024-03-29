package com.sathish.angulartest.thahira.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.thahira.entity.CustomerMaster;
import com.sathish.angulartest.thahira.repository.CustomerRepository;
import com.sathish.angulartest.thahira.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CustomerService {
	
	private static final Logger logger = LoggerFactory.getLogger(ExperienceService.class);
	
	@Autowired
	CustomerRepository customerrepository;
	
	 public Response saveCustomer(CustomerMaster customer) {
		   validateCustomer(customer);
	         customerrepository.save(customer);
	         logger.info("Experience saved successfully: {}", customer);
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
	            logger.info("Experience updated successfully: {}", updatedCustomer);
	            return new Response(1,"success",updatedCustomer,true);
	        } else {
	          	 logger.error("Experience with ID {} not found during update.", customerId);
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
	 
	 
	 private void validateCustomer(CustomerMaster customer) {
	        if (customer == null) {
	            throw new IllegalArgumentException("Customer object cannot be null");
	        }

	        validateStringField("Customer name", customer.getCustomerName());
	        validateStringField("Customer location", customer.getCustomerLocation());
	        validatePositiveOrZero("Number of projects completed", customer.getNoOfProjectsCompleted());
	        validateStringField("Status", customer.getStatus());
	    }

	    private void validateStringField(String fieldName, String value) {
	        if (value == null || value.trim().isEmpty()) {
	        }
	    }

	    private void validatePositiveOrZero(String fieldName, int value) {
	        if (value < 0) {
	            throw new IllegalArgumentException(fieldName + " should be a positive number or zero");
	        }
	    }
	
	

}
