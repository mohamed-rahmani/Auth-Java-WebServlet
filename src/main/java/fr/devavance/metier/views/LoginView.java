/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package fr.devavance.metier.views;

import fr.devavance.metier.views.interfaces.IServletView;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author kn_21
 */
@WebServlet(name = "LoginView", urlPatterns = {"/login"})
public class LoginView extends HttpServlet implements IServletView {

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
        response.setContentType("text/html;charset=UTF-8");
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
        try (PrintWriter out = response.getWriter()) {
            out.println("<form action='controller_login' method='post'>");
            out.println("<label>login</label>");
            out.println("<input type='text' name='login'/></br></br>");
            out.println("<label>password</label>");
            out.println("<input type='password' name='password'/></br>");
            out.println("<input type='submit' value='Login'/>");
            out.println("</form>");
        }
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

    @Override
    public void include_header(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            getServletContext().getRequestDispatcher(HEADER).include(request, response);
        } catch (ServletException e) {
            throw new ServletException("Erreur lors de l'inclusion du header", e);
        }
    }

    @Override
    public void include_footer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            getServletContext().getRequestDispatcher(FOOTER).include(request, response);
        } catch (ServletException e) {
            throw new ServletException("Erreur lors de l'inclusion du header", e);
        }
    }
}
