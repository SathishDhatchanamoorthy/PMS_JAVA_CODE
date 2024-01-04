package com.sathish.angulartest.thahira.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.angulartest.thahira.entity.LocationMaster;
import com.sathish.angulartest.thahira.repository.LocationRepository;
import com.sathish.angulartest.thahira.response.Response;


@Service
public class LocationService {

		@Autowired
		private LocationRepository locationRepository;

		public Response saveLocation(LocationMaster location) {
         locationRepository.save(location);
         return new Response(1,"success",location,true);
		}
		
		
	
		public List<LocationMaster> getAllLocations() {
	        return (List<LocationMaster>) locationRepository.findAll();
		}
		
		
	 
		public Optional<LocationMaster> getLocationById(Long locationId) {
	        return locationRepository.findById(locationId);
		}
		
		
	  
		public Response updateLocation(Long locationId, LocationMaster updatedLocation) {
	        if (locationRepository.existsById(locationId)) {
	            updatedLocation.setLocationId(locationId);
	            return new Response(1,"success",updatedLocation,true);
	        } else {
	            // Handle not found scenario
	            return new Response(2,"error",updatedLocation,false);
	        }
		}

	  
		public String deleteLocation(Long locationId) {
			 if (locationRepository.existsById(locationId)) {
				 locationRepository.deleteById(locationId);
		        return "Deleted Successfully";
		        }
			 else {
				 return "Failed To Delete";
			 }
		}
}
