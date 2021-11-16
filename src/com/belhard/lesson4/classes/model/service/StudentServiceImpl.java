package com.belhard.lesson4.classes.model.service;

import com.belhard.lesson4.classes.model.beans.entities.Student;
import com.belhard.lesson4.classes.model.beans.groups.Group;
import com.belhard.lesson4.classes.model.dao.StudentDao;
import com.belhard.lesson4.classes.model.dao.impl.StudentDaoJdbcImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final StudentDao studentDao = new StudentDaoJdbcImpl();
    private final GroupService groupService = new GroupServiceImpl();

    @Override
    public Student getById(long id) {
        Student student = studentDao.getById(id);
        Group group = groupService.getGroupByStudentId(id);
        student.setGroup(group);
        return student;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public void create(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
