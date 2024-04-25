package org.example.dao;
import org.example.domain.Minerales;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MineralesMapper implements RowMapper<Minerales> {
    @Override
    public Minerales map(ResultSet rs, StatementContext ctx) throws SQLException {
        Minerales minerales = new Minerales();
        minerales.setId(rs.getInt("id"));
        minerales.setNombre(rs.getString("nombre"));
        minerales.setCantidad(rs.getDouble("cantidad"));
        return minerales;
    }
}
