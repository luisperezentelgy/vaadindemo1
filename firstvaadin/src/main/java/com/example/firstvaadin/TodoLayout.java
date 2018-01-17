package com.example.firstvaadin;

import com.vaadin.data.*;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.ValoTheme;

public class TodoLayout extends HorizontalLayout {
	private final CheckBox done;
	private final TextField text;
	
	public TodoLayout(Todo todo) {
		setSpacing(true);
		setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
		
		done = new CheckBox();
		text = new TextField();
		
		text.setStyleName(ValoTheme.TEXTAREA_BORDERLESS);
		text.setWidth("100%");
		
		Binder<Todo> binder = new Binder<>(Todo.class);
		binder.bindInstanceFields(this);
		binder.setBean(todo);
		
		addComponents(done, text);
		setExpandRatio(text, 1);
	}
	

}
