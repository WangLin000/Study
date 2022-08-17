package service;

import java.sql.SQLException;

import model.User;

public interface UserService {
	public boolean isUserExist(String username) throws SQLException;

	public User login(String username, String password) throws SQLException;

	public boolean register(String username, String password, String userdesc) throws SQLException;
}
