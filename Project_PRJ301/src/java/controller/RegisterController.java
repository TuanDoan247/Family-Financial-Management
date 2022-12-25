package controller;

import entity.Manager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOManager;

public class RegisterController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        DAOManager daoMana = new DAOManager();

        boolean isValid = daoMana.check(username, password);

        if (!isValid) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            String fullname = request.getParameter("fullname");
            String phone = request.getParameter("phone");
            
            Manager obj = new Manager(random(), fullname, phone, username, password);
            daoMana.insertManager(obj);
            
            response.sendRedirect("home");
        } else {
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        }
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
