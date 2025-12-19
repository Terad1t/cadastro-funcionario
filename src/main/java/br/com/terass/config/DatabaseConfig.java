package br.com.terass.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    private static final String URL = "jdbc:postgresql://localhost:5432/empresa";
    private static final String USER = "admin";
    private static final String PASSWORD = "admin";

    public static Connection getConnection() throws SQLException {
        if (URL == null || USER == null || PASSWORD == null) {
            throw new IllegalStateException("As variáveis de ambiente DB_URL, DB_USER ou DB_PASSWORD não estão definidas.");
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
