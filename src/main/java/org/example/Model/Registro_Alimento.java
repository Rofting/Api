package org.example.Model;
import lombok.Data;
import lombok.AllArgsConstructor;
import java.sql.Date;
@Data
@AllArgsConstructor

public class Registro_Alimento {
    private int idRegistro;
    private int idUsuario;
    private int idAlimento;
    private int cantidadConsumida;
    private Date fechaConsumo;

}
