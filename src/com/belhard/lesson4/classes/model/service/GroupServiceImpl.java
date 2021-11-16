package com.belhard.lesson4.classes.model.service;

import com.belhard.lesson4.classes.model.beans.entities.Student;
import com.belhard.lesson4.classes.model.beans.entities.Teacher;
import com.belhard.lesson4.classes.model.beans.groups.Group;
import com.belhard.lesson4.classes.model.dao.GroupDao;
import com.belhard.lesson4.classes.model.dao.StudentDao;
import com.belhard.lesson4.classes.model.dao.TeacherDao;
import com.belhard.lesson4.classes.model.dao.impl.GroupDaoJdbcImpl;
import com.belhard.lesson4.classes.model.dao.impl.StudentDaoJdbcImpl;
import com.belhard.lesson4.classes.model.dao.impl.TeacherDaoJdbcImpl;

import java.util.List;

public class GroupServiceImpl implements GroupService {
    private final StudentDao studentDao = new StudentDaoJdbcImpl();
    private final GroupDao groupDao = new GroupDaoJdbcImpl();
    private final TeacherDao teacherDao = new TeacherDaoJdbcImpl();

    @Override
    public Group getGroupByStudentId(long studentId) {
        Group group = groupDao.getByStudentId(studentId);
        if (group == null) {
            return null;
        }
        List<Student> students = studentDao.getByGroupId(group.getId());
        students.forEach(s -> {
            s.setGroup(group);
            group.addStudent(s);
        });
        Teacher teacher = teacherDao.getByGroupId(group.getId());
        teacher.setGroup(group);
        group.setTeacher(teacher);
        return group;
    }
}
