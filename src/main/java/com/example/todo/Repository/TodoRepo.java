package com.example.todo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.todo.Entity.Todo;
import org.springframework.stereotype.Repository;

public interface TodoRepo extends JpaRepository <Todo, Long > {
}
