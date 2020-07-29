package com.mike.controller;

import com.mike.model.TodoData;
import com.mike.model.TodoItem;
import com.mike.service.TodoItemService;
import com.mike.util.AttributeNames;
import com.mike.util.Mappings;
import com.mike.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Slf4j
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

	//    http://localhost:8080/todo-list/items
	@GetMapping(Mappings.ITEMS)
	public String items()
	{
		return ViewNames.ITEMS_LIST;
	}


	//    http://localhost:8080/todo-list/add_item
	@GetMapping(Mappings.ADD_ITEM)
	public String addEditItem(Model model)
	{
		TodoItem todoItem = new TodoItem("", "", LocalDate.now());
		model.addAttribute(AttributeNames.TODO_ITEM, todoItem );
		return ViewNames.ADD_ITEM;
	}

	@PostMapping(Mappings.ADD_ITEM)
	public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM) TodoItem todoItem)
	{
		log.info("todoItem form = {}", todoItem );
		todoItemService.addItem(todoItem);
		return "redirect:/" + Mappings.ITEMS;
	}

}
