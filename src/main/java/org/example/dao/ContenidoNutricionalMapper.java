package org.example.dao;
import org.example.domain.ContenidoNutricional;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContenidoNutricionalMapper implements RowMapper<ContenidoNutricional> {
    @Override
    public ContenidoNutricional map(ResultSet rs, StatementContext ctx) throws SQLException {
        ContenidoNutricional contenidoNutricional = new ContenidoNutricional();
        contenidoNutricional.setId(rs.getInt("id"));
        contenidoNutricional.setCalorias(rs.getDouble("calorias"));
        contenidoNutricional.setProteinas(rs.getDouble("proteinas"));
        contenidoNutricional.setCarbohidratos(rs.getDouble("carbohidratos"));
        contenidoNutricional.setGrasas(rs.getDouble("grasas"));
        return contenidoNutricional;
    }
}
