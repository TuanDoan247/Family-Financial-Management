

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
        %>
        <div style="width: 300px; height: 39px; background-color: white; border-radius: 2px; border-bottom: 2px solid #15A362;">
            <h6 style="padding: 6px 0px; color: #15A362; text-align: center;">Year</h6>
        </div>
        <div style="margin-top: 25px;">
            <table>
                <thead>
                    <tr>
                        <th style="width: 300px; height: 37.5px; background-color: white; margin-bottom: 10px; border-radius: 5px 5px 0px 0px; padding-left: 10px; font-size: 16px;">List Category</th>
                    </tr>
                </thead>
                <tbody style="margin-top: 2px;">
                    <%
                        int stt = 1;
                        while (rsCate.next()) {
                    %>
                    <tr>
                        <td style="height: 52px;background-color: white; padding-left: 10px;"><%=stt%> - <%=rsCate.getString(1)%></td>
                    </tr>
                    <%
                            stt++;
                        }
                    %>

                </tbody>
            </table>

        </div>
    </body>
</html>
