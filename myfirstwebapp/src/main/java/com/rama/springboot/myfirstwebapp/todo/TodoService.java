package com.rama.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int count = 0;
	static {
		todos.add(new Todo(++count, "Rama", "Learn Aws", LocalDate.now().plusMonths(1), false));
		todos.add(new Todo(++count, "Rama", "Learn React", LocalDate.now().plusMonths(2), false));
		todos.add(new Todo(++count, "Rama", "Learn Fsd", LocalDate.now().plusMonths(3), false));
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		TodoService.count = count;
	}

	public static List<Todo> getTodos() {
		return todos;
	}

	public List<Todo> findByUsername(String username) {
		Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);

		return todos.stream().filter(predicate).toList();
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++count, username, description, targetDate, done);
		todos.add(todo);
	}

	public void deleteById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {

		deleteById(todo.getId());
		todos.add(todo);
	}

}
