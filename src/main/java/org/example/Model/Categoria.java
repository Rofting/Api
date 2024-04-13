package org.example.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oracle.sql.NUMBER;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Categoria {
    private int idCategoria;
    private String nombreCategoria;
}
