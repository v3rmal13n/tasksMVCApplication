package com.example.MyTODO.controllers;

import com.example.MyTODO.entity.Tasks;
import com.example.MyTODO.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MyFristController {
    @Autowired
    private TaskService taskService;
    @GetMapping("/")
    public String getAllTasks (Model model) {
        List<Tasks> allTasks = taskService.getAllTasks();
        model.addAttribute("allTasks", allTasks);
        return "all_tasks.html";
    }

    @GetMapping("/addNewTask")
    public String addNewTask (Model model) {
        Tasks tasks = new Tasks();
        model.addAttribute("tasks", tasks);
        return "add_task.html";
    }
    @GetMapping("/saveTask")
    public String saveTask (@ModelAttribute("tasks") Tasks tasks) {
        taskService.saveTask(tasks);
        return "redirect:/";
    }
    @GetMapping("{id}/updateTask")
    public String updateTask (Model model, @PathVariable int id) {
        Tasks tasks = taskService.getTask(id);
        model.addAttribute("tasks", tasks);
        return "add_task.html";
    }
    @GetMapping("{id}/deleteTask")
    public String deleteTask (Model model, @PathVariable int id) {
        taskService.deleteTask(id);
        return "redirect:/";
    }
}
