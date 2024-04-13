package org.example.Repository;
import org.jdbi.v3.core.statement.StatementContext;
import org.jdbi.v3.core.mapper.RowMapper;
import org.example.Model.Alimento;
import java.sql.ResultSet;
import java.sql.SQLException;

public class alimentoMapper implements RowMapper<Alimento> {
    @Override
    public Alimento map(ResultSet rs, StatementContext ctx) throws SQLException {
        Alimento alimento = new Alimento();
        alimento.setIdAlimento(rs.getInt("idAlimento"));
        alimento.setNombre(rs.getString("nombre"));
        alimento.setDescripcion(rs.getString("descripcion"));
        alimento.setIdCategoria(rs.getInt("idCategoria"));
        alimento.setIdContenido(rs.getInt("idContenido"));
        return alimento;
    }
}