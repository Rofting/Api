package org.example.dao;

import org.example.domain.Vitaminas;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VitaminasMapper implements RowMapper<Vitaminas> {
    @Override
    public Vitaminas map(ResultSet rs, StatementContext ctx) throws SQLException {
        Vitaminas vitaminas = new Vitaminas();
        vitaminas.setId(rs.getInt("id"));
        vitaminas.setNombre(rs.getString("nombre"));
        return vitaminas;
    }
}
