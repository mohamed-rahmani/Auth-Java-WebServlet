/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.devavance.metier.views.interfaces;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *
 * @author bouchaib.lemaire
 */
public interface IServletView {
    String CONTROLLER = "controller";
    String HEADER = "/WEB-INF/header.html";
    String FOOTER = "/WEB-INF/footer.html";
    String FORM_LOGOUT = "/WEB-INF/form_logout.html";
    
    public void include_header(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    
    public void include_footer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
