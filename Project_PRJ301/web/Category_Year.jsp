

<%@page import="java.sql.ResultSet"%>
<%@page import="model.DAOBill_MoneyOut"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            DAOBill_MoneyOut daoBill = new DAOBill_MoneyOut();
            String idMana = (String) session.getAttribute("idMana");
            ResultSet rsCate = daoBill.getCatagoryUse(idMana);
            Integer year = (Integer) session.getAttribute("year");
            int yearInput = 0;
            
            if(year != 0){
                if(year == 2021){
                    yearInput = 2021;
                }
                if(year == 2020){
                    yearInput = 2020;
                }
                if(year == 2019){
                    yearInput = 2019;
                }
            }
        %>
        <%
            float totalMoney = 0;
            int numberBill = 0;
            float average = 0;
            
            while (rsCate.next()) {
                ResultSet rsTotal = daoBill.getTotalMoneyforEachCategory(idMana, rsCate.getString(1), yearInput);
                while (rsTotal.next()) {
                    totalMoney += rsTotal.getFloat(4);
                    numberBill++;
                }
                if(totalMoney != 0 && numberBill!= 0){
                    average = totalMoney / numberBill;
                }
                
        %>
        <tr style="height: 52.5px;">
            <td class="cell" style="text-align: center;"><%=numberBill%></td>
            <td class="cell"><%=average%></td>
            <td class="cell"><%=totalMoney%></td>
            <td class="cell"><a class="btn-sm app-btn-secondary" href="list">View</a></td>
        </tr>
        <%
                average = 0;
                totalMoney = 0;
                numberBill = 0;
            }
        %>

</body>
</html>
