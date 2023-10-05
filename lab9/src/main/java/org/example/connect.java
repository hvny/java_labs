package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connect {
    public Connection getConnection(String driver, String url, String userName, String password) {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, userName, password);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void close(Connection connection){
        try {
            if(connection != null){
                connection.close();
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
    public void close(Connection connection, Statement statement, ResultSet resultSet){
        try {
            if(connection != null){
                connection.close();
            }
            if(statement != null){
                statement.close();
            }
            if(resultSet != null){
                resultSet.close();
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}