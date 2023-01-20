package com.example.MyTODO.entity;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name_task")
    private String nameTask;
    @Column(name = "task")
    private String task;

    public Tasks () {}

    public Tasks(String nameTask, String task) {
        this.nameTask = nameTask;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", nameTask='" + nameTask + '\'' +
                ", task='" + task + '\'' +
                '}';
    }
}
