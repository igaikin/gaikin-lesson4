package com.belhard.lesson4.classes.model.dao.impl;

import com.belhard.lesson4.classes.model.beans.entities.Student;
import com.belhard.lesson4.classes.model.beans.entities.Teacher;
import com.belhard.lesson4.classes.model.beans.entities.auxiliary.Address;
import com.belhard.lesson4.classes.model.dao.TeacherDao;
import com.belhard.lesson4.classes.model.dao.connection.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TeacherDaoJdbcImpl implements TeacherDao {
    private static final String GET_BY_GROUP_ID = "SELECT t.id, first_name, last_name, date_of_birth, address, group_id, chair, academic_degree "
            + "FROM teachers t WHERE group_id = ? AND deleted = false";

    @Override
    public Teacher getById(long id) {
        return null;
    }

    @Override
    public Teacher getByGroupId(long groupId) {
        Teacher teacher = null;
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(GET_BY_GROUP_ID);
            statement.setLong(1, groupId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                teacher = processTeacher(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teacher;
    }

    private Teacher processTeacher(ResultSet resultSet) throws SQLException {
        Teacher teacher = new Teacher();
        teacher.setId(resultSet.getLong("id"));
        teacher.setFirstName(resultSet.getString("first_name"));
        teacher.setLastName(resultSet.getString("last_name"));
        teacher.setDateOfBirth(resultSet.getDate("date_of_birth").toLocalDate());
        Address address = new Address();
        address.setCity(resultSet.getString("address"));
        teacher.setAddress(address);
        Teacher.AcademicDegree academicDegree = Teacher.AcademicDegree.valueOf(resultSet.getString("academic_degree"));
        teacher.setAcademicDegree(academicDegree);
        return teacher;
    }

    @Override
    public List<Teacher> getAll() {
        return null;
    }

    @Override
    public void create(Teacher teacher) {

    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public int delete(long id) {
        return 0;
    }
}
