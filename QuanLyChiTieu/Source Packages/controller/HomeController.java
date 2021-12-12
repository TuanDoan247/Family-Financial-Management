package controller;

import entity.Manager;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOBill_MoneyOut;
import model.DAOManager;
import model.DAOMenu;

public class HomeController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            DAOMenu daoMenu = new DAOMenu();
            DAOManager daoMana = new DAOManager();
            DAOBill_MoneyOut daoBill = new DAOBill_MoneyOut();

            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("username");

            if (username != null) {
                ResultSet rsMenu = daoMenu.getAll();

                String idManager = "";
                String name = "";
                ArrayList<Manager> listMana = daoMana.getAll();
                for (Manager mana : listMana) {
                    if (mana.getUsername().equals(username)) {
                        idManager = mana.getMid();
                        name = mana.getmFullName();
                    }
                }

                ResultSet rsTotalMoney = daoBill.getAll(idManager, 0);
                float totalMoney = 0;
                int numberBill = 0;

                while (rsTotalMoney.next()) {
                    totalMoney += rsTotalMoney.getFloat(4);
                    numberBill++;
                }

                ResultSet numberCategory = daoBill.getNumberCatagory(idManager);
                int numberCate = 0;
                while (numberCategory.next()) {
                    numberCate = numberCategory.getInt(1);
                }
                
                session.setAttribute("name", name);
                session.setAttribute("totalMoney", totalMoney);
                session.setAttribute("numberBill", numberBill);
                session.setAttribute("numberCate", numberCate);
                session.setAttribute("idManager", idManager);
                session.setAttribute("menu", rsMenu);
                
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            } else {
                response.sendRedirect("login");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
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
