package org.example.Repository;
import org.example.Model.Usuario;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class usuarioMapper implements RowMapper<Usuario> {
    @Override
    public Usuario map(ResultSet rs, StatementContext ctx) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(rs.getInt("idUsuario"));
        usuario.setNombreUsuario(rs.getString("nombreUsuario"));
        usuario.setApellidoUsuario(rs.getString("apellidoUsuario"));
        usuario.setEmail(rs.getString("email"));
        usuario.setContrasena(rs.getString("contrasena"));
        usuario.setAltura(rs.getFloat("altura"));
        usuario.setPeso(rs.getFloat("peso"));
        usuario.setFechaNacimiento(rs.getDate("fechaNacimiento"));
        return usuario;
    }
}
