package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    public Connection getConnection() {

        try {

            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/sistemacontrol", "control", "161095");

        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }

    }

}
