package com.example.todo.Controller;

import com.example.todo.Entity.Todo;
import com.example.todo.Service.TodoService;
import com.example.todo.Service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("?{id}" )
public class TodoController{

    @Autowired
    private TodoServiceImpl todoService;

    @GetMapping
    public List<Todo> findAll() {
        return todoService.getAllTodo();
    }

    @PostMapping
    public void save(@RequestBody Todo todo){
        todoService.saveTodo(todo);
    }

    @GetMapping("/{id}")
    public Todo findOne(@PathVariable Long id){
        return todoService.getTodoById(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Todo todo) {
        this.todoService.updateTodo(id, todo);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.todoService.deleteTodo(id);
    }

}


