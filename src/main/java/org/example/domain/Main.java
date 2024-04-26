package org.example.domain;
import org.example.dao.*;
import org.jdbi.v3.core.Jdbi;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        try {
            DatabaseConnector connector = new DatabaseConnector();
            DataSource dataSource = connector.getDataSource();

            Jdbi jdbi = Jdbi.create(dataSource);
            jdbi.registerRowMapper(new UsuarioMapper());
            jdbi.registerRowMapper(new CategoriasMapper());
            jdbi.registerRowMapper(new RegistrosConsumoAlimentosMapper());
            jdbi.registerRowMapper(new ContenidoNutricionalMapper());
            jdbi.registerRowMapper(new AlimentosMapper());
            jdbi.registerRowMapper(new VitaminasMapper());
            jdbi.registerRowMapper(new MineralesMapper());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}