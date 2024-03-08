package com.rama.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int count = 0;
	static {
		todos.add(new Todo(++count, "Rama", "Learn Aws", LocalDate.now().plusMonths(1), false));
		todos.add(new Todo(++count, "Rama", "Learn React", LocalDate.now().plusMonths(2), false));
		todos.add(new Todo(++count, "Rama", "Learn Fsd", LocalDate.now().plusMonths(3), false));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++count, username, description, targetDate, done);
		todos.add(todo);
	}

}
