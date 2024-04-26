package org.example.dao;

import javax.sql.DataSource;

import lombok.Getter;
import org.apache.commons.dbcp2.BasicDataSource;


public class DatabaseConnector {
    private final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/XE";
    private final String DB_USER = "JRODRIGUEZ";
    private final String DB_PASSWORD = "12231223";
    @Getter
    private final DataSource dataSource;

    public DatabaseConnector() {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(DB_URL);
        ds.setUsername(DB_USER);
        ds.setPassword(DB_PASSWORD);
        this.dataSource = ds;
    }

}
