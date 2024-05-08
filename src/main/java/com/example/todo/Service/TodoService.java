package com.example.todo.Service;

import com.example.todo.Entity.Todo;

import java.util.List;

public interface TodoService {

    List <Todo> getAllTodo();

    void saveTodo(Todo todo);

    void updateTodo(Long id,Todo todo);

    Todo getTodoById(long id);

    void deleteTodo(long id);
}
