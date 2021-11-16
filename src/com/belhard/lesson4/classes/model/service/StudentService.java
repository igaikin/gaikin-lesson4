package com.belhard.lesson4.classes.model.service;

import com.belhard.lesson4.classes.model.beans.entities.Student;

import java.util.List;

public interface StudentService {
    Student getById(long id);

    List<Student> getAll();

    void create(Student student);

    void update(Student student);

    boolean delete(long id);
}
