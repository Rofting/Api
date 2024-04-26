package org.example.dao;

import org.example.domain.Vitaminas;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

import org.jdbi.v3.sqlobject.statement.UseRowMapper;


public interface VitaminaDao {

    @SqlQuery("SELECT * FROM Vitaminas")
    List<Vitaminas> getAllVitaminas();

    @SqlQuery("SELECT * FROM Vitaminas WHERE id = :id")
    Vitaminas getVitaminaById(long id);

    @SqlUpdate("INSERT INTO Vitaminas (nombre, cantidad) VALUES (:nombre, :cantidad)")
    void insertVitamina(Vitaminas vitamina);

    @SqlUpdate("UPDATE Vitaminas SET nombre = :nombre, cantidad = :cantidad WHERE id = :id")
    int updateVitamina(Vitaminas vitamina);

    @SqlUpdate("DELETE FROM Vitaminas WHERE id = :id")
    int deleteVitamina(long id);
}
