package com.belhard.lesson4.classes.model.dao;

import com.belhard.lesson4.classes.model.beans.entities.Teacher;
import com.belhard.lesson4.classes.model.beans.groups.Group;

import java.util.List;

public interface GroupDao {
    Group getById(long id);

    Group getByStudentId(long studentId);

    List<Group> getAll();

    void create(Group group);

    void update(Group group);

    int delete(long id);
}
