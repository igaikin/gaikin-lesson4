package com.belhard.lesson4.classes.model.dao;

import com.belhard.lesson4.classes.model.entities.Student;

import java.util.List;

public interface StudentDao {
    Student getById(long id);

    List<Student> getAll();

    void create(Student student);

    void update(Student student);

    int delete(long id);
}
