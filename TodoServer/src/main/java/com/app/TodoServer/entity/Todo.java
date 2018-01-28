package com.app.TodoServer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
	@Id
	@GeneratedValue
	private int id;
	private String description;
	private String title;
	private boolean isCompleted;
	
	public Todo() {	}

	/**
	 * @param id
	 * @param description
	 * @param title
	 * @param isCompleted
	 */
	public Todo(int id, String description, String title, boolean isCompleted) {
		this.id = id;
		this.description = description;
		this.title = title;
		this.isCompleted = isCompleted;
	}
	
	/**
	 * @param description
	 * @param title
	 * @param isCompleted
	 */
	public Todo(String description, String title, boolean isCompleted) {
		super();
		this.description = description;
		this.title = title;
		this.isCompleted = isCompleted;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the isCompleted
	 */
	public boolean isCompleted() {
		return isCompleted;
	}
	/**
	 * @param isCompleted the isCompleted to set
	 */
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	

}
