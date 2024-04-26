package org.example.dao;
import org.jdbi.v3.core.statement.StatementContext;
import org.example.domain.RegistrosConsumoAlimentos;
import org.jdbi.v3.core.mapper.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

public class RegistrosConsumoAlimentosMapper implements RowMapper<RegistrosConsumoAlimentos> {
    @Override
    public RegistrosConsumoAlimentos map(ResultSet rs, StatementContext ctx) throws SQLException {
        RegistrosConsumoAlimentos registroAlimento = new RegistrosConsumoAlimentos();
        registroAlimento.setId(rs.getInt("id"));
        registroAlimento.setUsuarioId(rs.getInt("Usuario_id"));
        registroAlimento.setAlimentoId(rs.getInt("Alimento_id"));
        registroAlimento.setCantidadConsumida(rs.getDouble("Cantidad_consumida"));
        registroAlimento.setFechaConsumo(rs.getDate("Fecha_consumo"));
        return registroAlimento;
    }
}