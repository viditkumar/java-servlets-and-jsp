package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/deletetodo.do")
public class DeleteToDoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ToDoService todoService = new ToDoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		todoService.deleteTodo(request.getParameter("todo"));
		response.sendRedirect("/todo.do");
	}
}
