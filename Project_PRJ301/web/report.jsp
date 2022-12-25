<%@page import="java.sql.ResultSet"%>
<%@page import="model.DAOBill_MoneyOut"%>
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

    <body class="app">   	
        <header class="app-header fixed-top">	   	            
            <div class="app-header-inner">  
                <div class="container-fluid py-2">
                    <div class="app-header-content"> 
                        <div class="row justify-content-between align-items-center">
                            <div class="col-auto">
                                <a id="sidepanel-toggler" class="sidepanel-toggler d-inline-block d-xl-none" href="#">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" viewBox="0 0 30 30" role="img"><title>Menu</title><path stroke="currentColor" stroke-linecap="round" stroke-miterlimit="10" stroke-width="2" d="M4 7h22M4 15h22M4 23h22"></path></svg>
                                </a>
                            </div><!--//col-->
                            <div style="text-align: center;">
                                <h3>---- Expense Report ----</h3>
                            </div>
                        </div><!--//row-->
                    </div><!--//app-header-content-->
                </div><!--//container-fluid-->
            </div><!--//app-header-inner-->
            <div id="app-sidepanel" class="app-sidepanel sidepanel-hidden"> 
                <div id="sidepanel-drop" class="sidepanel-drop"></div>
                <div class="sidepanel-inner d-flex flex-column">
                    <a href="#" id="sidepanel-close" class="sidepanel-close d-xl-none">&times;</a>
                    <div class="app-branding">
                        <a class="app-logo" href="home"><img class="logo-icon me-2" src="assets/images/app-logo.svg" alt="logo"><span class="logo-text">PORTAL</span></a>

                    </div><!--//app-branding-->  
                    <nav id="app-nav-main" class="app-nav app-nav-main flex-grow-1">
                        <ul class="app-menu list-unstyled accordion" id="menu-accordion">
                            <li class="nav-item">
                                <!--//Bootstrap Icons: https://icons.getbootstrap.com/ -->
                                <a class="nav-link" href="list">
                                    <span class="nav-icon">
                                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-house-door" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path fill-rule="evenodd" d="M7.646 1.146a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 .146.354v7a.5.5 0 0 1-.5.5H9.5a.5.5 0 0 1-.5-.5v-4H7v4a.5.5 0 0 1-.5.5H2a.5.5 0 0 1-.5-.5v-7a.5.5 0 0 1 .146-.354l6-6zM2.5 7.707V14H6v-4a.5.5 0 0 1 .5-.5h3a.5.5 0 0 1 .5.5v4h3.5V7.707L8 2.207l-5.5 5.5z"/>
                                        <path fill-rule="evenodd" d="M13 2.5V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z"/>
                                        </svg>
                                    </span>
                                    <span class="nav-link-text">Back</span>
                                </a><!--//nav-link-->
                            </li><!--//nav-item-->
                            <li class="nav-item">
                                <!--//Bootstrap Icons: https://icons.getbootstrap.com/ -->
                                <a class="nav-link" href="report?action=reportyear">
                                    <span class="nav-icon">
                                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-folder" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M9.828 4a3 3 0 0 1-2.12-.879l-.83-.828A1 1 0 0 0 6.173 2H2.5a1 1 0 0 0-1 .981L1.546 4h-1L.5 3a2 2 0 0 1 2-2h3.672a2 2 0 0 1 1.414.586l.828.828A2 2 0 0 0 9.828 3v1z"/>
                                        <path fill-rule="evenodd" d="M13.81 4H2.19a1 1 0 0 0-.996 1.09l.637 7a1 1 0 0 0 .995.91h10.348a1 1 0 0 0 .995-.91l.637-7A1 1 0 0 0 13.81 4zM2.19 3A2 2 0 0 0 .198 5.181l.637 7A2 2 0 0 0 2.826 14h10.348a2 2 0 0 0 1.991-1.819l.637-7A2 2 0 0 0 13.81 3H2.19z"/>
                                        </svg>
                                    </span>
                                    <span class="nav-link-text">Result 1</span>
                                </a><!--//nav-link-->
                            </li><!--//nav-item-->
                            <li class="nav-item">
                                <!--//Bootstrap Icons: https://icons.getbootstrap.com/ -->
                                <a class="nav-link" href="report?action=reportyearhavechoose">
                                    <span class="nav-icon">
                                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-folder" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M9.828 4a3 3 0 0 1-2.12-.879l-.83-.828A1 1 0 0 0 6.173 2H2.5a1 1 0 0 0-1 .981L1.546 4h-1L.5 3a2 2 0 0 1 2-2h3.672a2 2 0 0 1 1.414.586l.828.828A2 2 0 0 0 9.828 3v1z"/>
                                        <path fill-rule="evenodd" d="M13.81 4H2.19a1 1 0 0 0-.996 1.09l.637 7a1 1 0 0 0 .995.91h10.348a1 1 0 0 0 .995-.91l.637-7A1 1 0 0 0 13.81 4zM2.19 3A2 2 0 0 0 .198 5.181l.637 7A2 2 0 0 0 2.826 14h10.348a2 2 0 0 0 1.991-1.819l.637-7A2 2 0 0 0 13.81 3H2.19z"/>
                                        </svg>
                                    </span>
                                    <span class="nav-link-text">Result 2</span>
                                </a><!--//nav-link-->
                            </li><!--//nav-item-->
                        </ul><!--//app-menu-->
                    </nav><!--//app-nav-->
                </div><!--//sidepanel-inner-->
            </div><!--//app-sidepanel-->
        </header><!--//app-header-->

        <div class="app-wrapper">
            <div class="app-content pt-3 p-md-3 p-lg-4">
                <div class="container-xl">
                    <nav id="orders-table-tab" class="orders-table-tab app-nav-tabs nav shadow-sm flex-column flex-sm-row mb-4">
                        <a class="flex-sm-fill text-sm-center nav-link active" id="orders-all-tab" data-bs-toggle="tab" href="#orders-all" role="tab" aria-controls="orders-all" aria-selected="true">Report</a>
                    </nav>
                    <div class="tab-content" id="orders-table-tab-content">
                        <div class="tab-pane fade show active" id="orders-all" role="tabpanel" aria-labelledby="orders-all-tab">
                            <div class="app-card app-card-orders-table shadow-sm mb-5">
                                <div class="app-card-body">
                                    <div class="table-responsive" style="overflow:visible;">
                                        <table class="table app-table-hover mb-0 text-left">
                                            <thead>
                                                <tr>
                                                    <th class="cell">STT</th>
                                                    <th class="cell">Year</th>
                                                    <th class="cell" style="text-align: center;">Total Money($)</th>
                                                    <th class="cell" style="text-align: center;">Category Name</th>
                                                    <th class="cell" style="text-align: center;">Number Category</th>
                                                    <th class="cell" style="text-align: center;">Number Bill</th>
                                                    <th class="cell"></th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    DAOBill_MoneyOut daoBill = new DAOBill_MoneyOut();
                                                    String idMana = (String) session.getAttribute("idMana");
                                                    session.setAttribute("idMana", idMana);
                                                    
                                                    int stt = 1;
                                                    float totalMoney = 0;
                                                    int numberBill = 0;
                                                    int numberCate = 0;

                                                    ResultSet rsyear = (ResultSet) session.getAttribute("rsYear");
                                                    while (rsyear.next()) {
                                                        ResultSet rs = daoBill.getAll(idMana, rsyear.getInt(1));
                                                        while (rs.next()) {
                                                            totalMoney += rs.getFloat(4);
                                                            numberBill++;
                                                        }
                                                        ResultSet rsCate = daoBill.getCatagory(idMana, rsyear.getInt(1));
                                                        while (rsCate.next()) {
                                                            numberCate++;
                                                        }
                                                        session.setAttribute("year", rsyear.getInt(1));
                                                %>
                                                <tr>
                                                    <td class="cell"><%=stt%></td>
                                                    <td class="cell"><%=rsyear.getInt(1)%></td>
                                                    <td class="cell" style="text-align: center;"><%=totalMoney%></td>
                                                    <td class="cell" style="text-align: center;">
                                                        <jsp:include page="dropdown.jsp"></jsp:include>
                                                    </td>
                                                    <td class="cell" style="text-align: center;"><%=numberCate%></td>
                                                    <td class="cell" style="text-align: center;"><%=numberBill%></td>
                                                    <td class="cell"><a class="btn-sm app-btn-secondary" href="list">View</a></td>
                                                </tr> 
                                                <%
                                                        stt++;
                                                        totalMoney = 0;
                                                        numberBill = 0;
                                                        numberCate = 0;
                                                    }
                                                %>
                                            </tbody>
                                        </table>
                                    </div><!--//table-responsive-->
                                </div><!--//app-card-body-->		
                            </div><!--//app-card-->
                        </div><!--//tab-pane-->
                    </div><!--//container-fluid-->
                </div><!--//app-content-->
            </div><!--//app-wrapper-->    					


            <!-- Javascript -->          
            <script src="assets/plugins/popper.min.js"></script>
            <script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>  


            <!-- Page Specific JS -->
            <script src="assets/js/app.js"></script> 

    </body>
</html> 

