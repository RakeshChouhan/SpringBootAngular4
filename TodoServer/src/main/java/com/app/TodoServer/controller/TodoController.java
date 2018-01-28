/**
 * 
 */
package com.app.TodoServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.TodoServer.entity.Todo;
import com.app.TodoServer.service.ITodoService;

/**
 * @author Rakesh
 *
 */
@RequestMapping("/api")
@RestController
public class TodoController {
	
	@Autowired
	private ITodoService todoService;
		
	@RequestMapping(method=RequestMethod.GET, path="/todos")
	public List<Todo> getAllTodo(){
		
		return todoService.getAllTodo();
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/todo")
	public String createTodoTask(@RequestBody Todo todo){
		
		return todoService.createTodoTask(todo);
	}
	
	@RequestMapping(method=RequestMethod.PUT, path="/todo/{id}")
	public String updateTodoTask(@PathVariable("id") int id){
		
		return todoService.updateTodoTask(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, path="/todo/{id}")
	public String deleteTodoTask(@PathVariable("id") int id){
		
		return todoService.deleteTodoTask(id);
	}

}
