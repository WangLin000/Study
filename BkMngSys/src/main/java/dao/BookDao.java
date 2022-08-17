package dao;

import java.sql.SQLException;
import java.util.List;

import model.Book;

public interface BookDao {
	public List<Book> getAllBooks() throws SQLException;
}
