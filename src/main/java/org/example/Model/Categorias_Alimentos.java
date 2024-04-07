package org.example.Model;

import oracle.sql.NUMBER;

public class Categorias_Alimentos {
    private NUMBER ID_CATEGORI;
    private String NOMBRE_CATEGORIA;

    public Categorias_Alimentos(NUMBER idCategori) {
        ID_CATEGORI = idCategori;
    }
}
