package com.belhard.lesson4.classes.model.dao.impl;

import com.belhard.lesson4.classes.model.dao.StudentDao;
import com.belhard.lesson4.classes.model.dao.connection.ConnectionManager;
import com.belhard.lesson4.classes.model.beans.entities.Student;
import com.belhard.lesson4.classes.model.beans.entities.auxiliary.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoJdbcImpl implements StudentDao {
    private final ConnectionManager connectionManager = ConnectionManager.getInstance();
    private static final String GET_BY_ID =
            "SELECT id, first_name, last_name, date_of_birth, address, course, group_id FROM students WHERE id = ? AND deleted = false";
    private static final String GET_ALL =
            "SELECT s.id, s.first_name, s.last_name, s.date_of_birth, s.address, s.course, s.group_id FROM students s WHERE deleted = false";
    private static final String GET_BY_GROUP_ID =
            "SELECT s.id, s.first_name, s.last_name, s.date_of_birth, s.address, s.course, s.group_id FROM students s WHERE deleted = false AND s.group_id = ?";

    @Override
    public Student getById(long id) {
        Student student = null;
        try {
            Connection connection = connectionManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(GET_BY_ID);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                student = processStudent(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    private Student processStudent(ResultSet resultSet) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getLong("id"));
        student.setFirstName(resultSet.getString("first_name"));
        student.setLastName(resultSet.getString("last_name"));
        student.setDateOfBirth(resultSet.getDate("date_of_birth").toLocalDate());
        Address address = new Address();
        address.setCity(resultSet.getString("address"));
        student.setAddress(address);
        student.setCourse(resultSet.getInt("course"));
        return student;
    }

    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        try {
            Connection connection = connectionManager.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL);
            while (resultSet.next()) {
                students.add(processStudent(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public List<Student> getByGroupId(long groupId) {
        List<Student> students = new ArrayList<>();
        try {
            Connection connection = connectionManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(GET_BY_GROUP_ID);
            statement.setLong(1, groupId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                students.add(processStudent(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public void create(Student student) {
    }

    @Override
    public void update(Student student) {
    }

    @Override
    public int delete(long id) {
        return 0;
    }
}
