package org.example.Repository;
import org.example.Model.Contenido_Nutricional;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;
import java.sql.ResultSet;
import java.sql.SQLException;

public class contenidoNutricionalMapper implements RowMapper<Contenido_Nutricional> {
    @Override
    public Contenido_Nutricional map(ResultSet rs, StatementContext ctx) throws SQLException {
        Contenido_Nutricional contenidoNutricional = new Contenido_Nutricional();
        contenidoNutricional.setIdContenido(rs.getInt("idContenido"));
        contenidoNutricional.setIdAlimento(rs.getInt("IdAlimento"));
        contenidoNutricional.setCalorias(rs.getInt("Calorias"));
        contenidoNutricional.setProteinas(rs.getInt("Proteinas"));
        contenidoNutricional.setCarbohidratos(rs.getInt("Carbohidratos"));
        contenidoNutricional.setGrasas(rs.getInt("Grasas"));
        contenidoNutricional.setVitaminas(rs.getString("Vitaminas"));
        contenidoNutricional.setMinerales(rs.getString("Minerales"));
        return contenidoNutricional;
    }
}
