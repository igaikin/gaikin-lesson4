package com.belhard.lesson4.classes.dao;

import com.belhard.lesson4.classes.model.entities.Student;

import java.util.List;

public interface StudentDao {
    Student getById(long id) throws Exception;

    List<Student> getAll() throws Exception;

    void create(Student student) throws Exception;

    void update(Student student);

    int delete(long id);
}
