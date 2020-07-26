package com.javatpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.dao.UserDao;
import com.javatpoint.model.User;

@Service
@org.springframework.transaction.annotation.Transactional
public class UserService {

	@Autowired
	private UserDao userDao;

	public int creatUser(User user) {
		return this.userDao.saveUser(user);
	}

}
