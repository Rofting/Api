package org.example.dao;

import org.example.domain.Categorias;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;

public interface CategoriaDao {

    @SqlQuery("SELECT * FROM Categorias")
    @UseRowMapper(CategoriasMapper.class)
    List<Categorias> getAllCategorias();

    @SqlQuery("SELECT * FROM Categorias WHERE id = :id")
    @UseRowMapper(CategoriasMapper.class)
    Categorias getCategoriaById(long id);

    @SqlUpdate("INSERT INTO Categorias (nombre) VALUES (:nombre)")
    void insertCategoria(Categorias categoria);

    @SqlUpdate("UPDATE Categorias SET nombre = :nombre WHERE id = :id")
    int updateCategoria(Categorias categoria);

    @SqlUpdate("DELETE FROM Categorias WHERE id = :id")
    int deleteCategoria(long id);
}
