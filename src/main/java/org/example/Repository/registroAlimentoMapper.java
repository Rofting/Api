package org.example.Repository;
import org.jdbi.v3.core.statement.StatementContext;
import org.example.Model.Registro_Alimento;
import org.jdbi.v3.core.mapper.RowMapper;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;

public class registroAlimentoMapper implements RowMapper<Registro_Alimento> {
    @Override
    public Registro_Alimento map(ResultSet rs, StatementContext ctx) throws SQLException {
        Registro_Alimento registroAlimento = new Registro_Alimento();
        registroAlimento.setIdRegistro(rs.getInt("idRegistro"));
        registroAlimento.setIdUsuario(rs.getInt("idUsuario"));
        registroAlimento.setIdAlimento(rs.getInt("idAlimento"));
        registroAlimento.setCantidadConsumida(rs.getInt("cantididadConsumida"));
        registroAlimento.setFechaConsumo(rs.getDate("fechaConsumo"));
        return registroAlimento;
    }
}