<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Account Manager</title>
        <link rel="stylesheet" href="account/css/loginCss.css">
    </head>
    <body>
        <div class="login-box">
            <h2>Register</h2>
            <form action="register" method="POST">
                <div class="user-box">
                    <input type="text" name="fullname" required="">
                    <label>Full Name</label>
                </div>
                <div class="user-box">
                    <input type="text" name="phone" required="">
                    <label>Phone</label>
                </div>
                <div class="user-box">
                    <input type="text" name="username" required="">
                    <label>Username</label>
                </div>
                <div class="user-box">
                    <input type="password" name="password" required="">
                    <label>Password</label>
                </div>
                <div>
                    <input type="submit" value="Register" id="login"/>
                </div>
                
                <a href="login">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                    Login
                </a>
            </form>
        </div>
    </body>
</html>
