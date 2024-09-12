package org.example.startup2.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
    private static MysqlConnection instance;
    private Connection connection;
    private String jdbcURL = "jdbc:mysql://localhost:3306/startup2";
    private String jdbcUsername = "root";
    private String jdbcPassword = "aikota11";
    private MysqlConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException(e);
        }
    }
    public static MysqlConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new MysqlConnection();
        }
        return instance;
    }
    public Connection getConnection() {
        try {
            if (connection.isClosed() || !connection.isValid(10)) {
                this.connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
