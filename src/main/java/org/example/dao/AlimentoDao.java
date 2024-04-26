package org.example.dao;
import org.example.dao.AlimentosMapper;
import org.example.domain.Alimentos;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;
public interface AlimentoDao {

    @SqlQuery("SELECT * FROM Alimentos")
    @UseRowMapper(AlimentosMapper.class)
    List<Alimentos> getAllAlimentos();

    @SqlQuery("SELECT * FROM Alimentos WHERE id = :id")
    @UseRowMapper(AlimentosMapper.class)
    Alimentos getAlimentoById(long id);


    @SqlQuery("SELECT * FROM Alimentos WHERE nombre = :nombre")
    @UseRowMapper(AlimentosMapper.class)
    Alimentos getAlimentoByNombre(String nombre);

    @SqlUpdate("INSERT INTO Alimentos (nombre, descripcion, categoria_Id, contenido_Nutricional_Id) VALUES (:nombre, :descripcion, :categoriaId, :contenidoNutricionalId)")
    void insertAlimento(Alimentos alimento);

    @SqlUpdate("UPDATE Alimentos SET nombre = :nombre, descripcion = :descripcion, categoria_Id = :categoriaId, contenido_Nutricional_Id = :contenidoNutricionalId WHERE id = :id")
    int updateAlimento(Alimentos alimento);

    @SqlUpdate("DELETE FROM Alimentos WHERE id = :id")
    int deleteAlimento(long id);
}
