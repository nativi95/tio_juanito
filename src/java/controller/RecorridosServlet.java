/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.RecorridosDao;
import conexion.Conexion;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BarriosBean;

/**
 *
 * @author juan.ruizusam
 */
public class RecorridosServlet extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String action=request.getParameter("action");
        switch(action){
            
        case "barrios": mostrarBarrios(request,response); break;
                
        }
        
    }
    
    protected void mostrarBarrios(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       Conexion conn= new Conexion();
       RecorridosDao barriosd= new RecorridosDao(conn);
        
        List<BarriosBean> lista= barriosd.mostrarBarrios();
        request.setAttribute("lista", lista);
                RequestDispatcher rd = request.getRequestDispatcher("distritos.jsp");
                rd.forward(request, response);
        
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
