package com.belhard.lesson4.classes.dao;

import com.belhard.lesson4.classes.model.entities.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoJdbcImpl implements StudentDao {

    @Override
    public Student getById(long id) throws SQLException, ClassNotFoundException {
        Connection connection = TeacherDaoJdbcImpl.getConnection();
        String sql = "SELECT id, first_name, last_name FROM students WHERE name = ? AND deleted  = false";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, id);
        ResultSet resultSet = statement.executeQuery();
        Student student = null;
        if (resultSet.next()) {
            student = new Student(student.getId(), student.getFirstName(), student.getLastName());
            student.setId(resultSet.getLong("id"));
            student.setFirstName(resultSet.getString("first_name"));
            student.setLastName(resultSet.getString("last_name"));
        }
        connection.close();
        return student;
    }

    @Override
    public List<Student> getAll() throws Exception {
        return null;
    }

    @Override
    public void create(Student student) throws SQLException, ClassNotFoundException {
        Connection connection = TeacherDaoJdbcImpl.getConnection();
        String sql = "INSERT INTO teachers (first_name, last_name) VALUES (first_name = ?, last_name = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, student.getFirstName());
        statement.setString(2, student.getLastName());
        statement.execute();
        connection.close();
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public int delete(long id) {
        return 0;
    }
}
