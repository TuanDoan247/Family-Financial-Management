
package controller;

import entity.Manager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOBill_MoneyOut;
import model.DAOManager;


public class ListController extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DAOManager daoMana = new DAOManager();
        DAOBill_MoneyOut daoBill = new DAOBill_MoneyOut();
        
        String idManager = "";
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        ArrayList<Manager> listMana = daoMana.getAll();
        for(Manager mana: listMana){
            if(mana.getUsername().equals(username)){
                idManager = mana.getMid();
            }
        }
        
        ResultSet rsAll = daoBill.getAll(idManager, 0);
        session.setAttribute("rsAll", rsAll);
        
        ResultSet rs2021 = daoBill.getAll(idManager, 2021);
        session.setAttribute("rs2021", rs2021);
        
        ResultSet rs2020 = daoBill.getAll(idManager, 2020);
        session.setAttribute("rs2020", rs2020);
        
        ResultSet rs2019 = daoBill.getAll(idManager, 2019);
        session.setAttribute("rs2019", rs2019);
        
        request.getRequestDispatcher("table.jsp").forward(request, response);
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
