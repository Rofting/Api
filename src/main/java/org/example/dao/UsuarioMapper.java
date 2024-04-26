package org.example.dao;
import org.example.domain.Usuarios;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioMapper implements RowMapper<Usuarios> {
    @Override
    public Usuarios map(ResultSet rs, StatementContext ctx) throws SQLException {
        Usuarios usuario = new Usuarios();
        usuario.setId(rs.getInt("id"));
        usuario.setNombre(rs.getString("nombre"));
        usuario.setApellido(rs.getString("apellido"));
        usuario.setNombreUsuario(rs.getString("nombre_usuario"));
        usuario.setContrasena(rs.getString("contrasena"));
        usuario.setEmail(rs.getString("email"));
        usuario.setGenero(rs.getString("genero"));
        usuario.setNivelActividad(rs.getString("nivel_actividad"));
        usuario.setObjetivoSalud(rs.getString("objetivo_salud"));
        usuario.setPreferenciasAlimenticias(rs.getString("preferencias_alimenticias"));
        usuario.setAltura(rs.getFloat("altura"));
        usuario.setPeso(rs.getFloat("peso"));
        usuario.setFechaNacimiento(rs.getDate("fechaNacimiento"));
        return usuario;
    }
}
