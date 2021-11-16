package com.belhard.lesson4.classes.model.dao.impl;

import com.belhard.lesson4.classes.model.beans.entities.Teacher;
import com.belhard.lesson4.classes.model.beans.groups.Group;
import com.belhard.lesson4.classes.model.dao.GroupDao;
import com.belhard.lesson4.classes.model.dao.connection.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GroupDaoJdbcImpl implements GroupDao {
    private static final String GET_BY_STUDENT_ID = "SELECT g.id, g.name, g.max_number_of_students FROM groups g "
            + "JOIN students s on g.id = s.group_id WHERE s.id = ?";


    @Override
    public Group getById(long id) {
        return null;
    }

    @Override
    public Group getByStudentId(long studentId) {
        Group group = null;
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(GET_BY_STUDENT_ID);
            statement.setLong(1, studentId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                group = processGroup(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return group;

    }

    private Group processGroup(ResultSet resultSet) throws SQLException {
        Group group = new Group();
        group.setId(resultSet.getLong("id"));
        group.setName(resultSet.getString("name"));
        group.setMaxNumberOfStudents(resultSet.getInt("max_number_of_students"));
        return group;
    }

    @Override
    public List<Group> getAll() {
        return null;
    }

    @Override
    public void create(Group group) {

    }

    @Override
    public void update(Group group) {

    }

    @Override
    public int delete(long id) {
        return 0;
    }
}
