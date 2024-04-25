package org.example.dao;
import org.jdbi.v3.core.statement.StatementContext;
import org.jdbi.v3.core.mapper.RowMapper;
import org.example.domain.Alimentos;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlimentosMapper implements RowMapper<Alimentos> {
    @Override
    public Alimentos map(ResultSet rs, StatementContext ctx) throws SQLException {
        Alimentos alimento = new Alimentos();
        alimento.setId(rs.getInt("id"));
        alimento.setNombre(rs.getString("nombre"));
        alimento.setDescripcion(rs.getString("descripcion"));
        alimento.setCategoriaId(rs.getInt("categoriaId"));
        alimento.setContenidoId(rs.getInt("contenidoId"));
        return alimento;
    }
}