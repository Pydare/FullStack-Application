package com.dare.playgroundwebbackend.repository;

import com.dare.playgroundwebbackend.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String>{
    

}