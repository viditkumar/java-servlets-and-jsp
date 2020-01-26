package webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoService {
	
	private static List<ToDo> todos = new ArrayList<ToDo>();
	
	static{
		todos.add(new ToDo("Learn WebApp"));
		todos.add(new ToDo("Learn Spring"));
		todos.add(new ToDo("Learn REST"));
	}
	
	public List<ToDo> getToDos(){
		return todos;
	}
	
	public void addTodo(String todo) {
		todos.add(new ToDo(todo));
	}
	
	public void deleteTodo(String todo) {
		todos.remove(new ToDo(todo));
	}

}
