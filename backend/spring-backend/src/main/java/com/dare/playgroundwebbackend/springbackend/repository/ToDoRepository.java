package com.dare.playgroundwebbackend.springbackend.repository;

import com.dare.playgroundwebbackend.springbackend.data.ToDo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {


}