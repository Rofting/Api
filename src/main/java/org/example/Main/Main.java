package org.example.Main;
import org.example.Repository.*;
import org.jdbi.v3.core.Jdbi;
import org.example.Main.DatabaseConnector;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        try {
            DatabaseConnector connector = new DatabaseConnector();
            DataSource dataSource = connector.getDataSource();

            Jdbi jdbi = Jdbi.create(dataSource);
            jdbi.registerRowMapper(new usuarioMapper());
            jdbi.registerRowMapper(new categoriaMapper());
            jdbi.registerRowMapper(new registroAlimentoMapper());
            jdbi.registerRowMapper(new contenidoNutricionalMapper());
            jdbi.registerRowMapper(new alimentoMapper());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}