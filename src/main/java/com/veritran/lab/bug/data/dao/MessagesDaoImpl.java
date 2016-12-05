package com.veritran.lab.bug.data.dao;

import com.veritran.lab.bug.service.data.domain.Request;
import com.veritran.lab.bug.service.data.domain.Response;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessagesDaoImpl extends JdbcDaoSupport implements MessagesDao {

    @Override
    public Long createMessage(Request request) {

        final String sql = "INSERT INTO message ( firstName, lastName, age ) VALUES (?, ?, ?)";
        final String firstName = request.getFirstName();
        final String lastName = request.getLastName();
        final String age = request.getAge();

        KeyHolder keyHolder = new GeneratedKeyHolder();
        getJdbcTemplate().update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement preparedStatement =
                                connection.prepareStatement(sql, new String[]{"id"});

                        preparedStatement.setString(1, firstName);
                        preparedStatement.setString(2, lastName);
                        preparedStatement.setString(3, age);
                        return preparedStatement;
                    }
                },
                keyHolder);
        return keyHolder.getKey().longValue();
    }





    @Override
    public void updateMessage(Response response) {
        final String sql = "UPDATE message SET dateOfBirth = ?, isFunny = ? WHERE id = ?";
        getJdbcTemplate().update(sql, response.getDateOfBirth(), response.getId(), response.isFunny());
    }

}

