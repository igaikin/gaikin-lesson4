package com.belhard.lesson4.classes.model.dao.impl;

import com.belhard.lesson4.classes.model.dao.StudentDao;
import com.belhard.lesson4.classes.model.dao.connection.ConnectionManager;
import com.belhard.lesson4.classes.model.entities.Student;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoJdbcImpl implements StudentDao {
    private final ConnectionManager connectionManager = ConnectionManager.getInstance();
    private static final String GET_BY_ID =
            "SELECT id, first_name, last_name FROM students WHERE id = ? AND deleted = false";
    private static final String GET_ALL = "SELECT id, first_name, last_name FROM students WHERE deleted = false";

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
