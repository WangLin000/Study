package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.UserDao;
import model.User;
import util.DBConnection;

public class UserDaoImpl implements UserDao {

	@Override
	public User findByName(String username) throws SQLException {
		User user = null;
		Connection con = new DBConnection().connection;
		String sql = "select * from sys_user where username=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, username);
		ResultSet res = pstmt.executeQuery();
		if (res.next()) {
			user = new User();
			user.setUid(res.getInt(1));
			user.setUsername(res.getString(2));
			user.setPassword(res.getString(3));
			user.setUserdesc(res.getString(4));
		}
		pstmt.close();
		con.close();
		return user;
	}

	@Override
	public boolean insertUser(String username, String password, String userdesc) throws SQLException {
		Connection con = new DBConnection().connection;
		String sql = "insert into sys_user values(null, ?, ?, ?);";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		pstmt.setString(3, userdesc);
		boolean res = pstmt.executeUpdate() == 0 ? false : true;
		pstmt.close();
		con.close();
		return res;
	}

}
