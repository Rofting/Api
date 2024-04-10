package org.example.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import oracle.sql.NUMBER;

@AllArgsConstructor
@Data
public class Categoria {
    private int idCategoria;
    private String nombreCategoria;
}
