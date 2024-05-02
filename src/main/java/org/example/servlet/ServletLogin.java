package org.example.servlet;

import org.example.dao.UsuarioDao;
import org.example.domain.Usuarios;
import org.jdbi.v3.core.Jdbi;
import org.example.dao.DatabaseConnector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.io.IOException;

@WebServlet("/login")
public class ServletLogin extends HttpServlet {
    private UsuarioDao usuarioDao;

    @Override
    public void init() throws ServletException {
        super.init();
        // Inicializa JDBI y el DAO utilizando la fuente de datos del conector de la base de datos
        DataSource dataSource = new DatabaseConnector().getDataSource();
        Jdbi jdbi = Jdbi.create(dataSource);
        usuarioDao = jdbi.onDemand(UsuarioDao.class);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Usuarios usuario = usuarioDao.getUsuario(username, password);
            if (usuario != null) {
                HttpSession session = request.getSession();
                session.setAttribute("id", usuario.getId());
                session.setAttribute("username", usuario.getNombreUsuario());
                // Otros atributos de sesión según necesidad
                response.getWriter().print("ok");
            } else {
                sendError("El usuario no existe", response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            sendError("Error desconocido", response);
        }
    }
    private void sendError(String message, HttpServletResponse response) throws IOException {
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        response.getWriter().print(message);
    }

}

