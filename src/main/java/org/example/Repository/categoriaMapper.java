package org.example.Repository;
import org.jdbi.v3.core.statement.StatementContext;
import org.example.Model.Categoria;
import org.jdbi.v3.core.mapper.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

public class categoriaMapper implements RowMapper<Categoria> {
    @Override
    public Categoria map(ResultSet rs, StatementContext ctx) throws SQLException {
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(rs.getInt("idCategoria"));
        categoria.setNombreCategoria(rs.getString("nombreCategoria"));
        return categoria;
    }
}
