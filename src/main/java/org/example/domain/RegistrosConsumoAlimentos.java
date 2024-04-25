package org.example.domain;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrosConsumoAlimentos {
    private int id;
    private int UsuarioId;
    private int AlimentoId;
    private double cantidadConsumida;
    private Date fechaConsumo;

}
