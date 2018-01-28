/**
 * 
 */
package com.app.TodoServer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.app.TodoServer.entity.Todo;

/**
 * @author Rakesh
 *
 */
@Repository
@Transactional
public class TodoDAOImpl implements ITodoDAO {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Todo> getAllTodo() {
		return entityManager.createQuery("From Todo").getResultList();
	}

	@Override
	public String createTodoTask(Todo todo) {
		String result = "FAIL";
		try {
			entityManager.persist(todo);
			result="SUCCESS";
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
	
	@Override
	public String deleteTodoTask(int id) {
		String result = "FAIL";
		try {
			entityManager
		     .createQuery("delete from Todo where id="+id)
		     .executeUpdate();
			result="SUCCESS";
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	@Override
	public String updateTodoTask(int id) {
		String result = "FAIL";
		try {
			entityManager
		     .createQuery("update Todo set isCompleted=true where id="+id)
		     .executeUpdate();
			result="SUCCESS";
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

}
