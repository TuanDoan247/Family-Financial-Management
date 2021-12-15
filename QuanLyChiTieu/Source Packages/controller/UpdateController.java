
package controller;

import entity.Bill_MoneyOut;
import entity.Manager;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOBill_MoneyOut;
import model.DAOManager;
import model.DAOMenu;


public class UpdateController extends HttpServlet {
    DAOManager daoMana = new DAOManager();
    DAOBill_MoneyOut daoBill = new DAOBill_MoneyOut();
    DAOMenu daoMenu = new DAOMenu();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idbill = request.getParameter("idbill");
        
        String idManager = "";
        String fullname = "";
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        ArrayList<Manager> listMana = daoMana.getAll();
        for(Manager mana: listMana){
            if(mana.getUsername().equals(username)){
                idManager = mana.getMid();
                fullname = mana.getmFullName();
            }
        }
        
        ResultSet rsBill = daoBill.getBill(idManager, idbill);
        ResultSet rsCate = daoMenu.getAll();
        
        session.setAttribute("rsbill", rsBill);
        session.setAttribute("rscate", rsCate);
        session.setAttribute("fullname", fullname);
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idbill = request.getParameter("idbill");
        Date date = Date.valueOf(request.getParameter("date"));
        String note = request.getParameter("note");
        float Money = Float.parseFloat(request.getParameter("moneyout"));
        int idMenu = Integer.parseInt(request.getParameter("idcate"));
        
        String idManager = "";
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        ArrayList<Manager> listMana = daoMana.getAll();
        for(Manager mana: listMana){
            if(mana.getUsername().equals(username)){
                idManager = mana.getMid();
            }
        }
        
        Bill_MoneyOut obj = new Bill_MoneyOut();
        obj.setDateCreate(date);
        obj.setDescription(note);
        obj.setMoneyOut(Money);
        obj.setMenuID(idMenu);
        
        daoBill.updateBill_MoneyOut(obj, idbill, idManager);
        
        request.getRequestDispatcher("list").forward(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
