package com.javatpoint.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javatpoint.model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional(readOnly = false)
	public int saveUser(User user) {
		int save = (Integer) this.hibernateTemplate.save(user);
		return save;
	}
}