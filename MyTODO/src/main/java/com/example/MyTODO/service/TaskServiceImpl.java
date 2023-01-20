package com.example.MyTODO.service;

import com.example.MyTODO.entity.Tasks;
import com.example.MyTODO.repositories.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TasksRepository tasksRepository;

    @Override
    public List<Tasks> getAllTasks() {
        return tasksRepository.findAll();
    }

    @Override
    public void saveTask(Tasks tasks) {
        tasksRepository.save(tasks);
    }

    @Override
    public Tasks getTask(int id) {
        Tasks tasks = null;
        Optional<Tasks> optional = tasksRepository.findById(id);
        if (optional.isPresent()) {
            tasks = optional.get();
        }
        return tasks;
    }

    @Override
    public void deleteTask(int id) {
        tasksRepository.deleteById(id);
    }
}
