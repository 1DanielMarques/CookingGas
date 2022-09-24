package br.com.cookingGas.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection createConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cooking_gas";
        String user = "root";
        String password = "";

        Connection con = null;
        con = DriverManager.getConnection(url, user, password);
        return con;

    }

}
