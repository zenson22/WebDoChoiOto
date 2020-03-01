package com.sonnguyen.webdochoioto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sonnguyen.webdochoioto.constant.SystemConstant;
import com.sonnguyen.webdochoioto.dto.MyUser;
import com.sonnguyen.webdochoioto.entity.Role;
import com.sonnguyen.webdochoioto.entity.User;
import com.sonnguyen.webdochoioto.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findOneByUsernameAndStatus(username, SystemConstant.ACTIVE_STATUS);

		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (Role role: user.getRoles()) {
			authorities.add(new SimpleGrantedAuthority("ROLE_"+ role.getCode()));
		}
		MyUser myUser = new MyUser(user.getUsername(), user.getPassword(), true, true, true, true,
				authorities);
		myUser.setFullName(user.getFullName());
		return myUser;
	}

}
