package com.mike.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData
{
    private static int idValue = 1;
    private final List<TodoItem> items = new ArrayList<>();

    public TodoData()
    {
        addItem(new TodoItem("first", "first details", LocalDate.now()));
        addItem(new TodoItem("second", "second details", LocalDate.now()));
        addItem(new TodoItem("third", "third details", LocalDate.now()));
        addItem(new TodoItem("fourth", "fourth details", LocalDate.now()));
        addItem(new TodoItem("fifth", "fifth details", LocalDate.now()));
    }

    public List<TodoItem> getItems()
    {
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull TodoItem toAdd)
    {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(@NonNull int id)
    {
        ListIterator<TodoItem> listIterator = items.listIterator();

        while (listIterator.hasNext())
        {
            TodoItem item = listIterator.next();

            if (item.getId() == id)
            {
                listIterator.remove();
                break;
            }
        }
    }

    public TodoItem getItem(@NonNull int id)
    {
        for (TodoItem item : items)
        {
            if (item.getId() == id)
                return item;
        }
        return null;
    }

    public void updateItem(@NonNull TodoItem toUpdate)
    {
        ListIterator<TodoItem> listIterator = items.listIterator();

        while (listIterator.hasNext())
        {
            TodoItem item = listIterator.next();

            if (item.equals(toUpdate))
            {
                listIterator.set(toUpdate);
                break;
            }
        }
    }
}
