package com.belhard.lesson4.classes.dao;

import com.belhard.lesson4.classes.model.entities.Teacher;

import java.util.List;

public interface TeacherDao {     //C R U D     C - create; R - read; U - update; D - delete
    Teacher getById(long id) throws Exception;

    List<Teacher> getAll() throws Exception;

    void create(Teacher teacher) throws Exception;

    void update(Teacher teacher);

    int delete(long id);
}
