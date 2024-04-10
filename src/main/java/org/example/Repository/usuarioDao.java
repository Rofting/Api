package org.example.Repository;
import org.example.Model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usuarioDao {
    private Connection connection;

    public usuarioDao(Connection connection) {
        this.connection = connection;
    }

    public void createUser(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO USUARIO (NOMBRE_USUARIO,APELLIDO_USUARIO,CONTRASENA,EMAIL,ALTURA,PESO,FECHA_NACIMIENTO) VALUES (?,?,?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, usuario.getNOMBRE_USUARIO());
            statement.setString(2, usuario.getAPELLIDO_USUARIO());
            statement.setString(3, usuario.getCONTRASENA());
            statement.setString(4, usuario.getEMAIL());
            statement.setFloat(5, usuario.getAltura());
            statement.setFloat(6, usuario.getPeso());
            statement.setDate(7, new java.sql.Date(usuario.getFECHA_NACIMIENTO().getTime()));
            statement.executeUpdate();
        }
    }

    public void deleteUser(Usuario usuario) throws SQLException {
        String sql = "DELETE FROM USUARIO WHERE NOMBRE_USUARIO = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, usuario.getNOMBRE_USUARIO());
            statement.executeUpdate();
        }
    }
}
public void updateUser(Usuario usuario) throws SQLException{
    String sql = "UPDATE usuario SET nombre_usuario = ?, apellido_usuario = ?, correo_electronico = ?, contrasena = ?, altura = ?, peso = ?, fecha = ? WHERE id_usuario = ?";
    try (PreparedStatement statement = connection.prepareStatement(sql)){
        statement.setString(1, usuario.getNOMBRE_USUARIO());
    }
}