package org.example.servlet;

import org.example.dao.DatabaseConnector;
import org.example.dao.UsuarioDao;
import org.example.domain.Usuarios;
import org.jdbi.v3.core.Jdbi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


@WebServlet(name = "ServletRegistroUsuario", value = "/registro")
public class ServletRegistroUsuario extends HttpServlet {
    private UsuarioDao usuarioDao;

    @Override
    public void init() throws ServletException {
        super.init();
        DataSource dataSource = new DatabaseConnector().getDataSource();
        Jdbi jdbi = Jdbi.create(dataSource);
        usuarioDao = jdbi.onDemand(UsuarioDao.class);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String nombreUsuario = request.getParameter("nombreUsuario");
        String contrasena = request.getParameter("contrasena");
        String email = request.getParameter("email");
        String genero = request.getParameter("genero");
        String nivelActividad = request.getParameter("nivelActividad");
        String objetivoSalud = request.getParameter("objetivoSalud");
        String preferenciasAlimenticias = request.getParameter("preferenciasAlimenticias");
        double altura = Double.parseDouble(request.getParameter("altura"));
        double peso = Double.parseDouble(request.getParameter("peso"));
        String fechaNacimientoStr = request.getParameter("fechaNacimiento");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate;
        try {
            utilDate = dateFormat.parse(fechaNacimientoStr);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new ServletException("Error parsing date string", e);
        }
        java.sql.Date fechaNacimiento = new java.sql.Date(utilDate.getTime());
        try{
            //Creamos objecto Usuario con los datos del formulario
            Usuarios nuevoUsuario = new Usuarios();
            nuevoUsuario.setNombre(nombre);
            nuevoUsuario.setApellido(apellido);
            nuevoUsuario.setNombreUsuario(nombreUsuario);
            nuevoUsuario.setContrasena(contrasena);
            nuevoUsuario.setEmail(email);
            nuevoUsuario.setGenero(genero);
            nuevoUsuario.setNivelActividad(nivelActividad);
            nuevoUsuario.setObjetivoSalud(objetivoSalud);
            nuevoUsuario.setPreferenciasAlimenticias(preferenciasAlimenticias);
            nuevoUsuario.setAltura(altura);
            nuevoUsuario.setPeso(peso);
            nuevoUsuario.setFechaNacimiento(fechaNacimiento);

            //Lo insertamos en la base de datos
            usuarioDao.insertUsuario(nuevoUsuario);

            response.getWriter().println("Usuario registrado exitosamente");
        } catch (Exception e){
            e.printStackTrace();
            response.getWriter().println("Error al registrar usuario");
        }
    }
}