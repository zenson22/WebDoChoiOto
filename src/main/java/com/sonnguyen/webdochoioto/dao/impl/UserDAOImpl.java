package com.sonnguyen.webdochoioto.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sonnguyen.webdochoioto.dao.UserDAO;
import com.sonnguyen.webdochoioto.entity.User;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void insert(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void update(User user) {
		sessionFactory.getCurrentSession().merge(user);
	}

	@Override
	public void delete(Long id) {
		sessionFactory.getCurrentSession().delete(getUserById(id));
	}

	@Override
	public User getUserById(Long id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUser() {
		Criteria criteria=sessionFactory.getCurrentSession().createCriteria(User.class);
		return criteria.list();
	}

}
