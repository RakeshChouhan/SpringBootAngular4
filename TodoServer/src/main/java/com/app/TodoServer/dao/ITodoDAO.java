package com.app.TodoServer.dao;

import java.util.List;

import com.app.TodoServer.entity.Todo;

/**
 * 
 * @author Rakesh
 *
 */
public interface ITodoDAO {
	public List<Todo> getAllTodo();

	public String createTodoTask(Todo todo);
	
	public String deleteTodoTask(int id) ;

	public String updateTodoTask(int id);
	
}
