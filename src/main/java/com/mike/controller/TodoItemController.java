package com.mike.controller;

import com.mike.model.TodoData;
import com.mike.model.TodoItem;
import com.mike.service.TodoItemService;
import com.mike.util.AttributeNames;
import com.mike.util.Mappings;
import com.mike.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoItemController
{

	private final TodoItemService todoItemService;

	@Autowired
	public TodoItemController(TodoItemService todoItemService)
	{
		this.todoItemService = todoItemService;
	}

	@ModelAttribute
	public TodoData todoData()
	{
		return todoItemService.getData();
	}

	@GetMapping(Mappings.ITEMS)
	public String items()
	{
		return ViewNames.ITEMS_LIST;
	}


	@PostMapping(Mappings.ADD_ITEM)
	public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM) TodoItem todoItem)
	{
		return "redirect:/" + Mappings.ITEMS;
	}

}
