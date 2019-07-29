package com.risk.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.risk.model.User;

@Repository
public class UserDaoimple extends AbstractDao<Integer, User> implements UserDao{
	
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(User user) {
		session.getCurrentSession().save(user);
	}

}
