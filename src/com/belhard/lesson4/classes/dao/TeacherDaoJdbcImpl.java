package com.belhard.lesson4.classes.dao;

import com.belhard.lesson4.classes.model.entities.Teacher;

import java.sql.*;
import java.util.List;

public class TeacherDaoJdbcImpl implements TeacherDao {

    static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc//127.0.0.1;5432/university";
        String userName = "postgres";
        String password = "root";
        return DriverManager.getConnection(url, userName, password);
    }

    @Override
    public Teacher getById(long id) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        String sql = "SELECT id, first_name, last_name FROM teachers WHERE name = ? AND deleted  = false";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, id);
        ResultSet resultSet = statement.executeQuery();
        Teacher teacher = null;
        if (resultSet.next()) {
            teacher = new Teacher(teacher.getId(), teacher.getFirstName(), teacher.getLastName());
            teacher.setId(resultSet.getLong("id"));
            teacher.setFirstName(resultSet.getString("first_name"));
            teacher.setLastName(resultSet.getString("last_name"));
        }
        connection.close();
        return teacher;
    }

    @Override
    public List<Teacher> getAll() throws Exception {
//
//        Connection connection = getConnection();
//        Statement statement = connection.createStatement();
//        String sql = "SELECT id, first_name, last_name FROM teachers WHERE deleted = false";
//        ResultSet resultSet = statement.executeQuery(sql);
//        List<Teacher> teachers = new ArrayList<>();
//        while (resultSet.next()) {
//            Teacher teacher = new Teacher();
//            teacher.setId(resultSet.getLong("id"));
//            teacher.setFirstName(resultSet.getString("first_name"));
//            teacher.setLastName(resultSet.getString("last_name"));
//            teachers.add(teacher);
//        }
//        return teachers;
        return null;
    }

    @Override
    public void create(Teacher teacher) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        String sql = "INSERT INTO teachers (first_name, last_name) VALUES (first_name = ?, last_name = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, teacher.getFirstName());
        statement.setString(2, teacher.getLastName());
        statement.execute();
        connection.close();
    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public int delete(long id) {
        return 0;
    }
}
