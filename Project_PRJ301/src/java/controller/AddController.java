
package controller;

import entity.Bill_MoneyOut;
import entity.Manager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOBill_MoneyOut;
import model.DAOManager;
import model.DAOMenu;


public class AddController extends HttpServlet {
    DAOMenu daoMenu = new DAOMenu();
    DAOBill_MoneyOut daobill = new DAOBill_MoneyOut();
    DAOManager daoMana = new DAOManager();
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ResultSet rsMenu = daoMenu.getAll();
        request.setAttribute("rsMenu", rsMenu);
        request.getRequestDispatcher("/insert.jsp").forward(request, response);
    }
        
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idBill = random();
        Date date = Date.valueOf(request.getParameter("date"));
        String note = request.getParameter("note");
        float Money = Float.parseFloat(request.getParameter("moneyout"));
        int idMenu = Integer.parseInt(request.getParameter("idMenu"));
        
        String idManager = "";
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        ArrayList<Manager> listMana = daoMana.getAll();
        for(Manager mana: listMana){
            if(mana.getUsername().equals(username)){
                idManager = mana.getMid();
            }
        }
        
        Bill_MoneyOut obj = new Bill_MoneyOut(idBill, date, note, Money, idMenu, idManager);
        
        daobill.insertBill(obj);
        
        request.getRequestDispatcher("list").forward(request, response);
    }

    public static String random(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int len = 3;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(len)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString.toUpperCase();
    }   
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
