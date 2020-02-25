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
import com.sonnguyen.webdochoioto.entity.Roles;
import com.sonnguyen.webdochoioto.entity.Users;
import com.sonnguyen.webdochoioto.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users userEntity = userRepository.findOneByUsernameAndStatus(username, SystemConstant.ACTIVE_STATUS);

		if (userEntity == null) {
			throw new UsernameNotFoundException("User not found");
		}
		List<GrantedAuthority> authorities = new ArrayList<>();
		Roles role = userEntity.getRoles();
		authorities.add(new SimpleGrantedAuthority(role.getCode()));
		MyUser myUser = new MyUser(userEntity.getUsername(), userEntity.getPassword(), true, true, true, true,
				authorities);
		myUser.setFullName(userEntity.getFullName());
		return myUser;
	}

}
