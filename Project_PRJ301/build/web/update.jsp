<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+JP&display=swap');
            * {box-sizing: border-box}
            body{
                font-family: 'Noto Sans JP', sans-serif;
            }
            h1, label{
                color: DodgerBlue;
            }
            /* Full-width input fields */
            input[type=text], input[type=password] {
                width: 100%;
                padding: 15px;
                margin: 5px 0 22px 0;
                display: inline-block;
                border: none;
                width:100%;
                resize: vertical;
                padding:15px;
                border-radius:15px;
                border:0;
                box-shadow:4px 4px 10px rgba(0,0,0,0.2);
            }

            input[type=text]:focus, input[type=password]:focus {
                outline: none;
            }

            hr {
                border: 1px solid #f1f1f1;
                margin-bottom: 25px;
            }

            /* Set a style for all buttons */
            button {
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
                opacity: 0.9;
            }

            button:hover {
                opacity:1;
            }

            /* Extra styles for the cancel button */
            .cancelbtn {
                padding: 14px 20px;
                background-color: #f44336;
            }

            /* Float cancel and signup buttons and add an equal width */
            .signupbtn {
                float: left;
                width: 100%;
                border-radius:15px;
                border:0;
                box-shadow:4px 4px 10px rgba(0,0,0,0.2);
            }

            /* Add padding to container elements */
            .container {
                padding: 16px;
            }

            /* Clear floats */
            .clearfix::after {
                content: "";
                clear: both;
                display: table;
            }


        </style>
        <%
            ResultSet rsBill = (ResultSet) session.getAttribute("rsbill");
            ResultSet rsCate = (ResultSet) session.getAttribute("rscate");
            String fullname = (String) session.getAttribute("fullname");
        %>
    </head>
    <body>
        <form action="update" method="POST" >
            <div class="container">
                <h1>Update Information</h1>
                <hr>
                <label for="manager"><b>Manager: </b><%=fullname%></label>
                <input type="hidden" name="manager" value="<%=fullname%>" required>
                <br>
                <% if(rsBill.next()){ %>
                <label for="idbill"><b>Bill ID: </b><%=rsBill.getString(1)%></label>
                <input type="hidden" name="idbill" value="<%=rsBill.getString(1)%>" required>
                <br>
                <label for="note"><b>Note</b></label>
                <input type="text" placeholder="Enter Note" name="note" value="<%=rsBill.getString(3)%>" required>

                <label for="date"><b>Date</b></label>
                <br>
                <input type="date" name="date" value="<%=rsBill.getString(2)%>" style="margin-bottom:30px; border: none;padding: 10px;box-shadow: 2px 5px gainsboro; border-radius: 20px;" required>
                <br>

                <label for="money"><b>Money Spent</b></label>
                <input type="text" placeholder="Enter Money Spent" value="<%=rsBill.getString(4)%>" name="moneyout" required>

                <label for="email"><b>Category</b></label>
                <br>
                
                <select name="idcate" style="margin-top:10px;border: none;padding: 10px;box-shadow: 2px 5px gainsboro; border-radius: 20px;">
                    <% while(rsCate.next()){%>
                    <option
                        <%=rsCate.getString(1).equals(rsBill.getString(5)) ?"selected=\"selected\"":""%>
                        value="<%=rsCate.getString(1)%>"><%=rsCate.getString(2)%>
                        </option>
                    <%}%>
                </select>
                <br>
                <%}%>
                <div class="clearfix">
                    <button type="submit" class="signupbtn">Update</button>
                </div>
            </div>
        </form>
    </body>
</html>
