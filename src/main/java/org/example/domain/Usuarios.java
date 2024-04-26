package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@NoArgsConstructor
@Data
@AllArgsConstructor

public class Usuarios {
    private int id;
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private String contrasena;
    private String email;
    private String genero;
    private String nivelActividad;
    private String objetivoSalud;
    private String preferenciasAlimenticias;
    private double altura;
    private double peso;
    private Date fechaNacimiento;
}
