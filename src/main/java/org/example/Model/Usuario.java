package org.example.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.sql.Date;

@Data
@AllArgsConstructor
public class Usuario {
    private String idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String email;
    private String contrasena;
    private float altura;
    private float peso;
    private Date fechaNacimiento;
}
