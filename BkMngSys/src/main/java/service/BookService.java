package service;

import java.sql.SQLException;
import java.util.List;

import model.Book;

public interface BookService {
	public List<Book> getBookList() throws SQLException;
}
