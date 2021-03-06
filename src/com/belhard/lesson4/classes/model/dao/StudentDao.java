package com.belhard.lesson4.classes.model.dao;

import com.belhard.lesson4.classes.model.beans.entities.Student;

import java.util.List;

public interface StudentDao {
    Student getById(long id);

    List<Student> getAll();

    List<Student> getByGroupId(long groupId);

    void create(Student student);

    void update(Student student);

    int delete(long id);
}
