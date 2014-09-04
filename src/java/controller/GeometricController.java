/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GeometricCalculator;

/**
 *
 * @author James
 */
@WebServlet(name = "GeometricController", urlPatterns = {"/GeometricController"})
public class GeometricController extends HttpServlet {

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
        response.setContentType("text/html");

        String length = request.getParameter("length");
        String width = request.getParameter("width");
        String radius = request.getParameter("radius");
        String sideA = request.getParameter("sideA");
        String sideB = request.getParameter("sideB");

        GeometricCalculator geometricCalculator = new GeometricCalculator();

        //Circle Controller
        if (radius != null && !radius.isEmpty()) {
            double circleRadius = Double.parseDouble(request.getParameter("radius"));
            double circle = geometricCalculator.calculateCircleArea(circleRadius);
            request.setAttribute("totalArea", circle);
        }
        //Rectangle Controller
        if (length != null && !length.isEmpty() && width != null && !width.isEmpty()) {
            double rectLength = Double.parseDouble(request.getParameter("length"));
            double rectWidth = Double.parseDouble(request.getParameter("width"));
            double rectangle = geometricCalculator.calculateRectangleArea(rectLength, rectWidth);
            request.setAttribute("totalArea", rectangle);
        }
        //Triangle Controller
        if (sideA != null && !sideA.isEmpty() && sideB != null && !sideB.isEmpty()) {
            double triSideA = Double.parseDouble(request.getParameter("sideA"));
            double triSideB = Double.parseDouble(request.getParameter("sideB"));
            double triangle = geometricCalculator.calculateTriangleArea(triSideA, triSideB);
            request.setAttribute("totalArea", triangle);

        }

        RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
        view.forward(request, response);
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
