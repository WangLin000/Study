package service.impl;

import java.sql.SQLException;
import java.util.List;

import dao.BookDao;
import dao.impl.BookDaoImpl;
import model.Book;
import service.BookService;

public class BookServiceImpl implements BookService {
	private BookDao bookdao;

	public BookServiceImpl() {
		bookdao = new BookDaoImpl();
	}

	@Override
	public List<Book> getBookList() throws SQLException {
		return bookdao.getAllBooks();
	}

}
