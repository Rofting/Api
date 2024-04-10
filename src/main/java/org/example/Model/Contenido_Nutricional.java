package org.example.Model;
import lombok.Data;
import lombok.AllArgsConstructor;
import oracle.sql.NUMBER;

@Data
@AllArgsConstructor
public class ContenidoNutricional {
    private int idContenido; // Cambiado a camelCase
    private int idAlimento; // Cambiado a camelCase
    private int calorias;
    private int proteinas;
    private int carbohidratos;
    private int grasas;
    private String vitaminas;
    private String minerales;
}
