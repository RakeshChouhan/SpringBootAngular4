package com.app.TodoServer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.TodoServer.dao.ITodoDAO;
import com.app.TodoServer.entity.Todo;
import com.app.TodoServer.service.ITodoService;

/**
 * 
 * @author Rakesh
 *
 */
@Service
public class TodoService implements ITodoService {
	
	@Autowired
	private ITodoDAO todoDAO;

	@Override
	public List<Todo> getAllTodo() {
		return todoDAO.getAllTodo();
	}

	@Override
	public String createTodoTask(Todo todo) {
		return todoDAO.createTodoTask(todo);
	}

	@Override
	public String updateTodoTask(int id) {
		return todoDAO.updateTodoTask(id);
	}

	@Override
	public String deleteTodoTask(int id) {
		return todoDAO.deleteTodoTask(id);
	}

}
