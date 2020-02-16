package com.sonnguyen.webdochoioto.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sonnguyen.webdochoioto.dao.UserDAO;
import com.sonnguyen.webdochoioto.entity.Users;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void insert(Users user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void update(Users user) {
		sessionFactory.getCurrentSession().merge(user);
	}

	@Override
	public void delete(Integer id) {
		sessionFactory.getCurrentSession().delete(getUserById(id));
	}

	@Override
	public Users getUserById(Integer id) {
		return (Users) sessionFactory.getCurrentSession().get(Users.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAllUser() {
		Criteria criteria=sessionFactory.getCurrentSession().createCriteria(Users.class);
		return criteria.list();
	}

}
