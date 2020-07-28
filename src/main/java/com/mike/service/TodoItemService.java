package com.mike.service;

import com.mike.model.TodoData;
import com.mike.model.TodoItem;

public interface TodoItemService
{
	public void addItem(TodoItem toAdd);

	public void removeItem(int id);

	public TodoItem getItem(int id);

	public void updateItem(TodoItem toUpdate);

	public TodoData getData();
}
