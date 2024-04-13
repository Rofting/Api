package org.example.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oracle.sql.NUMBER;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Alimento {
    private int idAlimento;
    private String nombre;
    private String descripcion;
    private int idCategoria;
    private int idContenido;
}
