package com.example.firstvaadin;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vaadin.ui.VerticalLayout;

@Component
public class TodoList extends VerticalLayout{
	
	@Autowired
	TodoRepository repository;
	
	@PostConstruct
	void init() {
		setSpacing(true);
		
		update();
	}
	
	public TodoList() {
		// TODO Auto-generated constructor stub
	}
	
	private void setTodos(List<Todo> todos) {
		removeAllComponents();
		
		todos.forEach(todo->{
			addComponent(new TodoLayout(todo));
		});
	}
	
	public void add(Todo todo) {
		repository.save(todo);
		update();
	}
	
	private void update() {
		setTodos(repository.findAll());
	}
}
