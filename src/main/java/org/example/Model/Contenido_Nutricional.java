package org.example.Model;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import oracle.sql.NUMBER;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contenido_Nutricional {
    private int idContenido;
    private int idAlimento;
    private int calorias;
    private int proteinas;
    private int carbohidratos;
    private int grasas;
    private String vitaminas;
    private String minerales;
}
