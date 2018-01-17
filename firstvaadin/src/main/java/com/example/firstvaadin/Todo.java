package com.example.firstvaadin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private boolean done;
	
	private String text;
	
	public Todo() {
	}

	
	public Todo(String text) {
		this.text = text;
	}
	
	public Todo(String text, boolean done) {
		this.text = text;
		this.done = done;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	
	public void toogleDone() {
		setDone(!isDone());
	}
	
}
