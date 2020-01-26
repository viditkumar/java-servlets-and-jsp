package webapp.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.todo.ToDoService;

@WebServlet(urlPatterns = "/todo.do")
public class ToDoServlet extends HttpServlet {

	private ToDoService todoservice = new ToDoService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("todos", todoservice.getToDos());
		
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	}
}