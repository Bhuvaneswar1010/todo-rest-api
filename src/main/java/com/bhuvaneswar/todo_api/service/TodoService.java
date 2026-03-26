package com.bhuvaneswar.todo_api.service;

import com.bhuvaneswar.todo_api.model.Todo;
import java.util.List;

public interface TodoService {
    Todo createTodo(Todo todo);
    List<Todo> getAllTodos();
    Todo getTodoById(Long id);
    Todo updateTodo(Long id, Todo todo);
    void deleteTodo(Long id);
    List<Todo> getTodosByStatus(boolean completed);
}