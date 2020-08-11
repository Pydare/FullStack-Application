package com.dare.playgroundwebbackend.springbackend.service;

import java.util.List;

import com.dare.playgroundwebbackend.springbackend.data.ToDo;
import com.dare.playgroundwebbackend.springbackend.exception.EntityNotFoundException;
import com.dare.playgroundwebbackend.springbackend.repository.ToDoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> findAll(){
        return toDoRepository.findAll();
    }

    public ToDo findById(String id){
        return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToDo save(ToDo toDo){
        return toDoRepository.save(toDo);
    }

    public void deleteById(String id){
        toDoRepository.deleteById(id);
    }

}