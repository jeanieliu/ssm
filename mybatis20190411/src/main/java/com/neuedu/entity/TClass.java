package com.neuedu.entity;

import java.util.List;

public class TClass {
    private Integer id;
    private String name;
    private Teacher teacher;

    private List<Student> lists;

    public List<Student> getLists() {
        return lists;
    }

    public void setLists(List<Student> lists) {
        this.lists = lists;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "TClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", lists=" + lists +
                '}';
    }
}
