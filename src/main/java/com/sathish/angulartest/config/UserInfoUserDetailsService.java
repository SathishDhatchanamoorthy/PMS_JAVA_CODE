package com.sathish.angulartest.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
@Component
public class UserInfoUserDetailsService implements UserDetailsService{
	

	
	 @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//	        Optional<UserInfo> userInfo = sm.findByUsername(username);
//	        return userInfo.map(UserInfoUserDetails::new)
//	                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));
		 return null;

	    }

}
