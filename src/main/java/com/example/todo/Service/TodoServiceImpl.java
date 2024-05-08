package com.example.todo.Service;

import com.example.todo.Entity.Todo;
import com.example.todo.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.tools.Tool;
import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoRepo todoRepo;

    @Override
    public List<Todo> getAllTodo() {
        return todoRepo.findAll();
    }

    @Override
    public void saveTodo(Todo todo) {
        this.todoRepo.save(todo);
    }
    @Override
    public Todo getTodoById(Long id){
        Optional <Todo> optional =todoRepo.findById(id);
        Todo todo;

        if (optional.isPresent()){
            todo = optional.get();
        } else {
            throw new RuntimeException(" to do for this id"+ "is not found");
        }

        return todo;
    }

    @Override
    public void updateTodo(Long id, Todo todo){
        Todo todoFormDb = todoRepo.findById(id).get();
        todoFormDb.setTaskName(todoFormDb.getTaskName());
        todoFormDb.setDesc(todoFormDb.getDesc());
        todoRepo.save(todoFormDb);
    }

    @Override
    public void deleteTodo(Long id) {
        this.todoRepo.deleteById(id);

    }
}
