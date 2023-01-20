package com.example.MyTODO.service;

import com.example.MyTODO.entity.Tasks;

import java.util.List;

public interface TaskService {
    public List<Tasks> getAllTasks ();

    public void saveTask (Tasks tasks);

    public Tasks getTask (int id);

    public void deleteTask (int id);
}
