package org.example.Repository;

import lombok.AllArgsConstructor;
import org.example.Model.Usuario;
import org.jdbi.v3.core.Jdbi;

import java.util.List;

@AllArgsConstructor
public class usuarioDao {
    private Jdbi jdbi;

    public void createUser(Usuario usuario) {
        jdbi.useHandle(handle ->
                handle.createUpdate("INSERT INTO USUARIO (NOMBRE_USUARIO, APELLIDO_USUARIO, EMAIL, CONTRASENA, ALTURA, PESO, FECHA_NACIMIENTO) VALUES (?, ?, ?, ?, ?, ?, ?)")
                        .bind(0, usuario.getNombreUsuario())
                        .bind(1, usuario.getApellidoUsuario())
                        .bind(2, usuario.getEmail())
                        .bind(3, usuario.getContrasena())
                        .bind(4, usuario.getAltura())
                        .bind(5, usuario.getPeso())
                        .bind(6, usuario.getFechaNacimiento())
                        .execute()
        );
    }

    public void deleteUser(Usuario usuario) {
        jdbi.useHandle(handle ->
                handle.createUpdate("DELETE FROM USUARIO WHERE nombreUsuario = ?")
                        .bind(0, usuario.getNombreUsuario())
                        .execute()
        );
    }

    public void updateUser(Usuario usuario) {
        jdbi.useHandle(handle ->
                handle.createUpdate("UPDATE USUARIO SET nombreUsuario = ?, apellidoUsuario = ?, email = ?, contrasena = ?, altura = ?, peso = ?, fechaNacimiento = ? WHERE nombreUsuario = ?")
                        .bind(0, usuario.getNombreUsuario())
                        .bind(1, usuario.getApellidoUsuario())
                        .bind(2, usuario.getEmail())
                        .bind(3, usuario.getContrasena())
                        .bind(4, usuario.getAltura())
                        .bind(5, usuario.getPeso())
                        .bind(6, usuario.getFechaNacimiento())
                        .bind(7, usuario.getNombreUsuario()) // Para el WHERE
                        .execute()
        );
    }

    public Usuario readUser(int idUsuario) {
        return jdbi.withHandle(handle ->
                handle.createQuery("SELECT * FROM USUARIO WHERE idUsuario = ?")
                        .bind(0, idUsuario)
                        .mapToBean(Usuario.class)
                        .findOnly()
        );
    }

    public List<Usuario> readAllUsers() {
        return jdbi.withHandle(handle ->
                handle.createQuery("SELECT * FROM USUARIO")
                        .mapToBean(Usuario.class)
                        .list()
        );
    }
}
