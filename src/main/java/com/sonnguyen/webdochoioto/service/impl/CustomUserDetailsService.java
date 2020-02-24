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

import com.sonnguyen.webdochoioto.dao.IUserDAO;
import com.sonnguyen.webdochoioto.dto.MyUser;
import com.sonnguyen.webdochoioto.entity.Roles;
import com.sonnguyen.webdochoioto.entity.Users;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private IUserDAO userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users userEntity = userDao.findOneByUsernameAndStatus(username, true);
		
		if (userEntity == null) {
			throw new UsernameNotFoundException("User not found");
		}
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (Roles role: userEntity.getRoleses()) {
			authorities.add(new SimpleGrantedAuthority(role.getCode()));
		}
		MyUser myUser = new MyUser(userEntity.getUsername(), userEntity.getPassword(), 
							true, true, true, true, authorities);
		myUser.setFullName(userEntity.getFullName());
		return myUser;
	}

}
