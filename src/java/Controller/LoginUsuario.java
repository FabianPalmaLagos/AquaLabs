/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.DaoUsuario;
import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fabian Palma
 */
public class LoginUsuario extends HttpServlet {

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

                String correo, contrasena, resp;
                List<DaoUsuario> login = new ArrayList();
                
                DaoUsuario daoUsuario = new DaoUsuario();
                Usuario usuario = new Usuario();
                RequestDispatcher requestDispatcher = null;
                
                correo = request.getParameter("correo");
                contrasena = request.getParameter("contrasena");
            
                //entity
                daoUsuario.setCorreo(correo);
                daoUsuario.setContrasena(contrasena);
                login = usuario.validaLogin(daoUsuario);
                
                
                if(login == daoUsuario ){
                    requestDispatcher = request.getRequestDispatcher("vistas/vistaLoginComun.jsp");
                    requestDispatcher.forward(request, response);
                } else{
                    resp = "Usuario o clave incorrecta.";
                    request.setAttribute("resp", resp);
                    requestDispatcher = request.getRequestDispatcher("vistas/vistaError.jsp");
                    requestDispatcher.forward(request, response);
                }
                
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
