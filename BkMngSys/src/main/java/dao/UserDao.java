package dao;

import java.sql.SQLException;

import model.User;

public interface UserDao {
	public User findByName(String username) throws SQLException;

	public boolean insertUser(String username, String password, String userdesc) throws SQLException;
}
