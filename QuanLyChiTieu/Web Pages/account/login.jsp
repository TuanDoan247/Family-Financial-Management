<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Account Manager</title>
        <link rel="stylesheet" href="account/css/loginCss.css">
    </head>
    <body>
        <div class="login-box">
            <h2>Login</h2>
            <form action="login" method="POST">
                <div class="user-box">
                    <input type="text" name="username" required="">
                    <label>Username</label>
                </div>
                <div class="user-box">
                    <input type="password" name="password" required="">
                    <label>Password</label>
                </div>
                
                <div>
                    <input type="submit" value="Login" id="login"/>
                </div>
                
                <a href="register">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                    Register
                </a>
            </form>
        </div>
    </body>
</html>
