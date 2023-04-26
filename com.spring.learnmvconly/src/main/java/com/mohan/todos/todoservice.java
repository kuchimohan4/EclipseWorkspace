package com.mohan.todos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class todoservice {

	
	private static List<todo> todos = new ArrayList<todo>();
	private static int todoCount = 3;

	static {
		todos.add(new todo(1, "in28Minutes", "Learn Spring MVC", new Date(),
				false));
		todos.add(new todo(2, "in28Minutes", "Learn Struts", new Date(), false));
		todos.add(new todo(3, "in28Minutes", "Learn Hibernate", new Date(),
				false));
	}

	public List<todo> retrievetodos(String user) {
		List<todo> filteredtodos = new ArrayList<todo>();
		for (todo todo : todos) {
			if (todo.getUser().equals(user))
				filteredtodos.add(todo);
		}
		return filteredtodos;
	}

	public void addtodo(String name, String desc, Date targetDate, boolean isDone) {
		todos.add(new todo(++todoCount, name, desc, targetDate, isDone));
	}

	public void deletetodo(int id) {
		Iterator<todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}
	
	
	
	
}
