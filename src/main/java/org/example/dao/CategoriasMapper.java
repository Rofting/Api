package org.example.dao;
import org.jdbi.v3.core.statement.StatementContext;
import org.example.domain.Categorias;
import org.jdbi.v3.core.mapper.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CategoriasMapper implements RowMapper<Categorias> {
    @Override
    public Categorias map(ResultSet rs, StatementContext ctx) throws SQLException {
        Categorias categoria = new Categorias();
        categoria.setId(rs.getInt("id"));
        categoria.setNombre(rs.getString("nombre"));
        return categoria;
    }
}
