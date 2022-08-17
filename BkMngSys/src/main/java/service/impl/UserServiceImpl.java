package service.impl;

import java.sql.SQLException;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao;

	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}



	@Override
	public User login(String username, String password) throws SQLException {
		User user = userDao.findByName(username);
		if (user != null && !user.getPassword().equals(password)) {
			user = null;
		}
		return user;
	}

	@Override
	public boolean register(String username, String password, String userdesc) throws SQLException {
		return userDao.insertUser(username, password, userdesc);
	}



	@Override
	public boolean isUserExist(String username) throws SQLException {
		User user = userDao.findByName(username);
		return user == null ? false : true;
	}

}
