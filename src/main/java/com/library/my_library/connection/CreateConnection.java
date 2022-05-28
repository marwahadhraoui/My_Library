package com.library.my_library.connection;

import java.sql.*;

public class CreateConnection {
    Connection con;

    public CreateConnection() {


    }

    public Connection Connect() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
        return con;


    }

    public void End() throws SQLException {
        if (con != null) {
            con.close();
        }

    }

}
