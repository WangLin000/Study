package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BookDao;
import model.Book;
import util.DBConnection;

public class BookDaoImpl implements BookDao {

	@Override
	public List<Book> getAllBooks() throws SQLException {
		Connection con = new DBConnection().connection;
		String sql = "select * from book";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet res = pstmt.executeQuery();
		List<Book> bookList = new ArrayList<Book>();
		while (res.next()) {
			Book book = new Book();
			book.setBid(res.getInt(1));
			book.setBname(res.getString(2));
			book.setAuthor(res.getString(3));
			book.setPrice(res.getInt(4));
			book.setPress(res.getString(5));
			bookList.add(book);
		}
		pstmt.close();
		con.close();
		return bookList;
	}

}
