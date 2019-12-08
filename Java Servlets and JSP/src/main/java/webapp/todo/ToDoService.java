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

}
