package org.example.Repository;

import org.example.Model.Usuario;

import java.sql.Connection;
import java.sql.SQLException;

public class usuarioDao{
    private Connection connection;

    public usuarioDao(Connection connection){
        this.connection = connection;
    }
    public void createUser(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO USUARIO (NOMBRE_USUARIO,APELLIDO_USUARIO,FECHA_NACIMIENTO)VALUES()";
    }
}