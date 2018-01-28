package com.app.TodoServer.service;

import java.util.List;

import com.app.TodoServer.entity.Todo;

/**
 * 
 * @author Rakesh
 *
 */
public interface ITodoService {
	public List<Todo> getAllTodo();

	public String createTodoTask(Todo todo);

	public String updateTodoTask(int id);

	public String deleteTodoTask(int id);

}
