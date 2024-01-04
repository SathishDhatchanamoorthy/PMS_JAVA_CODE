package com.sathish.angulartest.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.sathish.angulartest.entity.UserInfo;
import com.sathish.angulartest.mapper.StudentMapper;

@Component
public class UserInfoUserDetailsService implements UserDetailsService{
	
	@Autowired
	private StudentMapper sm;
	
	 @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        Optional<UserInfo> userInfo = sm.findByUsername(username);
	        return userInfo.map(UserInfoUserDetails::new)
	                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));

	    }

}
