package org.example.dao;


import org.example.domain.Minerales;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;
public interface MineralDao {

    @SqlQuery("SELECT * FROM Minerales")
    @UseRowMapper(MineralesMapper.class)
    List<Minerales> getAllMinerales();

    @SqlQuery("SELECT * FROM Minerales WHERE id = :id")
    @UseRowMapper(MineralesMapper.class)
    Minerales getMineralById(long id);

    @SqlUpdate("INSERT INTO Minerales (nombre, cantidad) VALUES (:nombre, :cantidad)")
    void insertMineral(Minerales mineral);

    @SqlUpdate("UPDATE Minerales SET nombre = :nombre, cantidad = :cantidad WHERE id = :id")
    int updateMineral(Minerales mineral);

    @SqlUpdate("DELETE FROM Minerales WHERE id = :id")
    int deleteMineral(long id);
}
