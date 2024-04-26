package org.example.dao;

import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import org.example.domain.ContenidoNutricional;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;


public interface ContenidoNutricionalDao {

    @SqlQuery("SELECT * FROM Contenido_Nutricional")
    @UseRowMapper(ContenidoNutricionalMapper.class)
    List<ContenidoNutricional> getAllContenidosNutricionales();

    @SqlQuery("SELECT * FROM Contenido_Nutricional WHERE id = :id")
    @UseRowMapper(ContenidoNutricionalMapper.class)
    ContenidoNutricional getContenidoNutricionalById(long id);

    @SqlUpdate("INSERT INTO Contenido_Nutricional (calorias, proteinas, carbohidratos, grasas) VALUES (:calorias, :proteinas, :carbohidratos, :grasas)")
    void insertContenidoNutricional(ContenidoNutricional contenidoNutricional);

    @SqlUpdate("UPDATE Contenido_Nutricional SET calorias = :calorias, proteinas = :proteinas, carbohidratos = :carbohidratos, grasas = :grasas WHERE id = :id")
    int updateContenidoNutricional(ContenidoNutricional contenidoNutricional);

    @SqlUpdate("DELETE FROM Contenido_Nutricional WHERE id = :id")
    int deleteContenidoNutricional(long id);
}
