/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.LoginDao;
import conexion.Conexion;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.UsuarioBean;

/**
 *
 * @author juan.ruizusam
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "login":
                login(request, response);
                break;
            default:
                throw new AssertionError();
        }
    }

    protected void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String registro = request.getParameter("registro");
        String clave = request.getParameter("clave");

        Conexion conn = new Conexion();
        LoginDao login = new LoginDao(conn);
        UsuarioBean usuario = new UsuarioBean(registro);
        usuario.setCorreo(registro);
        usuario.setClave(clave);
        boolean user = login.consultarUsuario(usuario);
        boolean correo = login.consultarCorreo(usuario);
        boolean cla;
        if (user) {
            if (login.consultarClave_usuario(usuario)) {

                if (login.consultarRol_usuario(usuario).getRol()) {
                    HttpSession session = request.getSession();
                    session.setAttribute("Id_usuario", usuario.getId_usuario());
                    response.sendRedirect("admin.jsp");
                } else {
                    HttpSession session = request.getSession();
                    session.setAttribute("Id_usuario", usuario.getId_usuario());
                    response.sendRedirect("cliente.jsp");
                }
            } else {
                String msg = "Clave invalida";

                request.setAttribute("msg", msg);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
        } else {
            if (correo) {
                if (login.consultarClave_correo(usuario)) {
                    if (login.consultarRol_Correo(usuario).getRol()) {
                        HttpSession session = request.getSession();
                        session.setAttribute("Correo", usuario.getCorreo());
                        response.sendRedirect("admin.jsp");
                    } else {
                        HttpSession session = request.getSession();
                        session.setAttribute("Correo", usuario.getCorreo());
                        response.sendRedirect("cliente.jsp");
                    }
                } else {
                    String msg = "Clave invalida";

                    request.setAttribute("msg", msg);
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
                }

            } else {
                String msg = "no existe usuario o correo";

                request.setAttribute("msg", msg);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
