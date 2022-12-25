<!DOCTYPE html>
<html lang="en"> 
    <head>
        <title>Portal - Bootstrap 5 Admin Dashboard Template For Developers</title>

        <!-- Meta -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <meta name="description" content="Portal - Bootstrap 5 Admin Dashboard Template For Developers">
        <meta name="author" content="Xiaoying Riley at 3rd Wave Media">    
        <link rel="shortcut icon" href="favicon.ico"> 

        <!-- FontAwesome JS-->
        <script defer src="assets/plugins/fontawesome/js/all.min.js"></script>

        <!-- App CSS -->  
        <link id="theme-style" rel="stylesheet" href="assets/css/portal.css">

    </head> 

    <body class="app app-signup p-0">    	
        <div class="row g-0 app-auth-wrapper">
            <div class="col-12 col-md-7 col-lg-6 auth-main-col text-center p-5">
                <div class="d-flex flex-column align-content-end">
                    <div class="app-auth-body mx-auto">	
                        <div class="app-auth-branding mb-4"><a class="app-logo" href="index.html"><img class="logo-icon me-2" src="assets/images/app-logo.svg" alt="logo"></a></div>
                        <h2 class="auth-heading text-center mb-4">Sign up to Portal</h2>					

                        <div class="auth-form-container text-start mx-auto">
                            <form class="auth-form auth-signup-form" action="register" method="POST">         
                                <div class="email mb-3">
                                    <label class="sr-only" for="signup-email">Your Full Name</label>
                                    <input id="signup-name" name="fullname" type="text" class="form-control signup-name" placeholder="Enter Full name" required="required">
                                </div>
                                <div class="email mb-3">
                                    <label class="sr-only" for="signup-email">Your Phone</label>
                                    <input id="signup-email" name="phone" type="text" class="form-control signup-email" placeholder="Enter Your Phone" required="required">
                                </div>
                                <div class="password mb-3">
                                    <label class="sr-only" for="signup-password">UserName</label>
                                    <input id="signup-password" name="username" type="text" class="form-control signup-password" placeholder="Create a UserName" required="required">
                                </div>
                                <div class="password mb-3">
                                    <label class="sr-only" for="signup-password">Password</label>
                                    <input id="signup-password" name="password" type="password" class="form-control signup-password" placeholder="Create a password" required="required">
                                </div>
                                <div class="text-center">
                                    <button type="submit" class="btn app-btn-primary w-100 theme-btn mx-auto">Sign Up</button>
                                </div>
                            </form><!--//auth-form-->

                            <div class="auth-option text-center pt-5">Already have an account? <a class="text-link" href="login" >Log in</a></div>
                        </div><!--//auth-form-container-->	



                    </div><!--//auth-body-->
                </div><!--//flex-column-->   
            </div><!--//auth-main-col-->
            <div class="col-12 col-md-5 col-lg-6 h-100 auth-background-col">
                <div class="auth-background-holder">			    
                </div>
                <div class="auth-background-mask"></div>
                <div class="auth-background-overlay p-3 p-lg-5">
                    <div class="d-flex flex-column align-content-end h-100">
                        <div class="h-100"></div>
                    </div>
                </div><!--//auth-background-overlay-->
            </div><!--//auth-background-col-->

        </div><!--//row-->


    </body>
</html> 

