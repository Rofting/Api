package org.example.dao;
import org.example.domain.Usuarios;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;

public interface UsuarioDao {

    @SqlQuery("SELECT  * FROM Usuarios")
    @UseRowMapper(UsuarioMapper.class)
    List<Usuarios> getAllUsuarios();

    @SqlQuery("SELECT * FROM Usuarios Where id = :id")
    @UseRowMapper(UsuarioMapper.class)
    Usuarios getUsuarioById(long id);

    @SqlQuery("SELECT * FROM Usuarios WHERE nombre_usuario = :username AND contrasena = SHA1(:password)")
    @UseRowMapper(UsuarioMapper.class)
    Usuarios getUsuario(String username, String password);


    @SqlUpdate("INSERT INTO Usuarios (nombre, apellido, nombre_Usuario, contrasena, email, genero, nivel_Actividad, objetivo_Salud, preferencias_Alimenticias, altura, peso, fecha_Nacimiento) VALUES (:nombre, :apellido, :nombreUsuario, SHA1(:contrasena), :email, :genero, :nivelActividad, :objetivoSalud, :preferenciasAlimenticias, :altura, :peso, :fechaNacimiento)")
    void insertUsuario(Usuarios usuario);

    @SqlUpdate("INSERT INTO Usuarios (nombre, apellido, nombre_Usuario, contrasena, email, genero, nivel_Actividad, objetivo_Salud, preferencias_Alimenticias, altura, peso, fecha_Nacimiento) VALUES (:nombre, :apellido, :nombreUsuario, SHA1(:contrasena), :email, :genero, :nivelActividad, :objetivoSalud, :preferenciasAlimenticias, :altura, :peso, :fechaNacimiento)")
    void insertUsuarios(List<Usuarios> usuarios);

    @SqlUpdate("UPDATE Usuarios SET nombre = :nombre, apellido = :apellido, nombre_Usuario = :nombreUsuario, contrasena = SHA1(:contrasena), email = :email, genero = :genero, nivel_Actividad = :nivelActividad, objetivo_Salud = :objetivoSalud, preferencias_Alimenticias = :preferenciasAlimenticias, altura = :altura, peso = :peso, fecha_Nacimiento = :fechaNacimiento WHERE id = :id")
    int updateUsuario(Usuarios usuario);

    @SqlUpdate("DELETE FROM Usuarios WHERE id = :id")
    int deleteUsuario(long id);
}