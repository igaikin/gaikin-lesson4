package com.belhard.lesson4.classes.model.dao;

import com.belhard.lesson4.classes.model.beans.entities.Teacher;

import java.util.List;

public interface TeacherDao {
    Teacher getById(long id);

    Teacher getByGroupId(long groupId);

    List<Teacher> getAll();

    void create(Teacher teacher);

    void update(Teacher teacher);

    int delete(long id);
}
