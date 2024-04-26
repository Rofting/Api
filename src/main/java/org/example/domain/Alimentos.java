package org.example.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Alimentos {
    private int id;
    private String nombre;
    private String descripcion;
    private int categoriaId;
    private int contenidoId;
}
