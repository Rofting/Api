package org.example.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String email;
    private String contrasena;
    private float altura;
    private float peso;
    private Date fechaNacimiento;
}
