
package controller;

import entity.Manager;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOBill_MoneyOut;
import model.DAOManager;


public class ReportController extends HttpServlet {
    DAOManager daoMana = new DAOManager();
    DAOBill_MoneyOut daoBill = new DAOBill_MoneyOut();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String action = request.getParameter("action");
        
        if(action.equals("reportyear")){
            String idMana = getIdofAccount(session);

            ResultSet rsYear = daoBill.getYear(idMana);

            session.setAttribute("idMana", idMana);
            session.setAttribute("rsYear", rsYear);

            request.getRequestDispatcher("report.jsp").forward(request, response);
        }
        
        if(action.equals("reportyearhavechoose")){
            String idMana = getIdofAccount(session);
            
            session.setAttribute("idMana", idMana);
            
            request.getRequestDispatcher("report_HaveSelect.jsp").forward(request, response);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    public String getIdofAccount(HttpSession session){
        String idManager = "";
        String username = (String) session.getAttribute("username");
        ArrayList<Manager> listMana = daoMana.getAll();
        for(Manager mana: listMana){
            if(mana.getUsername().equals(username)){
                idManager = mana.getMid();
            }
        }
        return idManager;
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
