package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Book;
import service.BookService;
import service.impl.BookServiceImpl;
@WebServlet(urlPatterns = "/bookList")
public class bookListServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BookService bookservice = new BookServiceImpl();
		try {
			List<Book> bookList = bookservice.getBookList();
			req.setAttribute("bookList", bookList);
			req.getRequestDispatcher("/bookList.jsp").forward(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
