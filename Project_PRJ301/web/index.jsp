<%@page import="model.DAOBill_MoneyOut"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html lang="en"> 
    <head>
        <title>Manage household expenses</title>

        <!-- Meta -->
        <meta charset="utf-8">

        <!-- FontAwesome JS-->
        <script defer src="assets/plugins/fontawesome/js/all.min.js"></script>

        <!-- App CSS -->  
        <link id="theme-style" rel="stylesheet" href="assets/css/portal.css">

        <%
            ResultSet rsMenu = (ResultSet) session.getAttribute("menu");
            Float totalMoney = (Float) session.getAttribute("totalMoney");
            Integer numberCate = (Integer) session.getAttribute("numberCate");
            Integer numberBill = (Integer) session.getAttribute("numberBill");
        %>
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

                            <div class="app-utilities col-auto">
                                <%
                                    String name = (String) session.getAttribute("name");
                                %>
                                <div class="app-utility-item">
                                    <h5>Manager: <%=name%></h5>
                                </div><!--//app-utility-item-->

                                <div class="app-utility-item app-user-dropdown dropdown">
                                    <a class="dropdown-toggle" id="user-dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false"><img src="assets/images/user.jpg" alt="user profile"></a>
                                    <ul class="dropdown-menu" aria-labelledby="user-dropdown-toggle">
                                        <li><a class="dropdown-item" href="#">Account</a></li>
                                        <li><hr class="dropdown-divider"></li>
                                        <li><a class="dropdown-item" href="logout">Log Out</a></li>
                                    </ul>
                                </div><!--//app-user-dropdown--> 
                            </div><!--//app-utilities-->
                        </div><!--//row-->
                    </div><!--//app-header-content-->
                </div><!--//container-fluid-->
            </div><!--//app-header-inner-->
            <div id="app-sidepanel" class="app-sidepanel"> 
                <div id="sidepanel-drop" class="sidepanel-drop"></div>
                <div class="sidepanel-inner d-flex flex-column">
                    <a href="#" id="sidepanel-close" class="sidepanel-close d-xl-none">&times;</a>
                    <div class="app-branding">
                        <a class="app-logo" href="home"><img class="logo-icon me-2" src="assets/images/app-logo.svg" alt="logo"><span class="logo-text">HOME</span></a>

                    </div><!--//app-branding-->  

                    <nav id="app-nav-main" class="app-nav app-nav-main flex-grow-1">
                        <ul class="app-menu list-unstyled accordion" id="menu-accordion">
                            <li class="nav-item">
                                <!--//Bootstrap Icons: https://icons.getbootstrap.com/ -->
                                <a class="nav-link active" href="home">
                                    <span class="nav-icon">
                                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-house-door" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path fill-rule="evenodd" d="M7.646 1.146a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 .146.354v7a.5.5 0 0 1-.5.5H9.5a.5.5 0 0 1-.5-.5v-4H7v4a.5.5 0 0 1-.5.5H2a.5.5 0 0 1-.5-.5v-7a.5.5 0 0 1 .146-.354l6-6zM2.5 7.707V14H6v-4a.5.5 0 0 1 .5-.5h3a.5.5 0 0 1 .5.5v4h3.5V7.707L8 2.207l-5.5 5.5z"/>
                                        <path fill-rule="evenodd" d="M13 2.5V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z"/>
                                        </svg>
                                    </span>
                                    <span class="nav-link-text">Overview</span>
                                </a><!--//nav-link-->
                            </li><!--//nav-item-->
                            <li class="nav-item">
                                <!--//Bootstrap Icons: https://icons.getbootstrap.com/ -->
                                <a class="nav-link" href="add">
                                    <span class="nav-icon">
                                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-folder" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path d="M9.828 4a3 3 0 0 1-2.12-.879l-.83-.828A1 1 0 0 0 6.173 2H2.5a1 1 0 0 0-1 .981L1.546 4h-1L.5 3a2 2 0 0 1 2-2h3.672a2 2 0 0 1 1.414.586l.828.828A2 2 0 0 0 9.828 3v1z"/>
                                        <path fill-rule="evenodd" d="M13.81 4H2.19a1 1 0 0 0-.996 1.09l.637 7a1 1 0 0 0 .995.91h10.348a1 1 0 0 0 .995-.91l.637-7A1 1 0 0 0 13.81 4zM2.19 3A2 2 0 0 0 .198 5.181l.637 7A2 2 0 0 0 2.826 14h10.348a2 2 0 0 0 1.991-1.819l.637-7A2 2 0 0 0 13.81 3H2.19z"/>
                                        </svg>
                                    </span>
                                    <span class="nav-link-text">Insert</span>
                                </a><!--//nav-link-->
                            </li><!--//nav-item-->
                            <li class="nav-item">
                                <!--//Bootstrap Icons: https://icons.getbootstrap.com/ -->
                                <a class="nav-link" href="list">
                                    <span class="nav-icon">
                                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-card-list" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path fill-rule="evenodd" d="M14.5 3h-13a.5.5 0 0 0-.5.5v9a.5.5 0 0 0 .5.5h13a.5.5 0 0 0 .5-.5v-9a.5.5 0 0 0-.5-.5zm-13-1A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-13z"/>
                                        <path fill-rule="evenodd" d="M5 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 5 8zm0-2.5a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7a.5.5 0 0 1-.5-.5zm0 5a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7a.5.5 0 0 1-.5-.5z"/>
                                        <circle cx="3.5" cy="5.5" r=".5"/>
                                        <circle cx="3.5" cy="8" r=".5"/>
                                        <circle cx="3.5" cy="10.5" r=".5"/>
                                        </svg>
                                    </span>
                                    <span class="nav-link-text">Table</span>
                                </a><!--//nav-link-->
                            </li><!--//nav-item-->
                            <li class="nav-item has-submenu">
                                <!--//Bootstrap Icons: https://icons.getbootstrap.com/ -->
                                <a class="nav-link submenu-toggle" href="#" data-bs-toggle="collapse" data-bs-target="#submenu-1" aria-expanded="false" aria-controls="submenu-1">
                                    <span class="nav-icon">
                                        <!--//Bootstrap Icons: https://icons.getbootstrap.com/ -->
                                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-files" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path fill-rule="evenodd" d="M4 2h7a2 2 0 0 1 2 2v10a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V4a2 2 0 0 1 2-2zm0 1a1 1 0 0 0-1 1v10a1 1 0 0 0 1 1h7a1 1 0 0 0 1-1V4a1 1 0 0 0-1-1H4z"/>
                                        <path d="M6 0h7a2 2 0 0 1 2 2v10a2 2 0 0 1-2 2v-1a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1H6a1 1 0 0 0-1 1H4a2 2 0 0 1 2-2z"/>
                                        </svg>
                                    </span>
                                    <span class="nav-link-text">Report</span>
                                    <span class="submenu-arrow">
                                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-chevron-down" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path fill-rule="evenodd" d="M1.646 4.646a.5.5 0 0 1 .708 0L8 10.293l5.646-5.647a.5.5 0 0 1 .708.708l-6 6a.5.5 0 0 1-.708 0l-6-6a.5.5 0 0 1 0-.708z"/>
                                        </svg>
                                    </span><!--//submenu-arrow-->
                                </a><!--//nav-link-->
                                <div id="submenu-1" class="collapse submenu submenu-1" data-bs-parent="#menu-accordion">
                                    <ul class="submenu-list list-unstyled">
                                        <li class="submenu-item"><a class="submenu-link" href="report?action=reportyear">1.Report Total Amount Spent By Year</a></li>
                                        <li class="submenu-item"><a class="submenu-link" href="report?action=reportyearhavechoose">2.Report Total Amount Spent By Year(Select Category)</a></li>
                                    </ul>
                                </div>
                            </li><!--//nav-item-->
                            <li class="nav-item has-submenu">
                                <!--//Bootstrap Icons: https://icons.getbootstrap.com/ -->
                                <a class="nav-link submenu-toggle" href="#" data-bs-toggle="collapse" data-bs-target="#submenu-2" aria-expanded="false" aria-controls="submenu-2">
                                    <span class="nav-icon">
                                        <!--//Bootstrap Icons: https://icons.getbootstrap.com/ -->
                                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-columns-gap" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path fill-rule="evenodd" d="M6 1H1v3h5V1zM1 0a1 1 0 0 0-1 1v3a1 1 0 0 0 1 1h5a1 1 0 0 0 1-1V1a1 1 0 0 0-1-1H1zm14 12h-5v3h5v-3zm-5-1a1 1 0 0 0-1 1v3a1 1 0 0 0 1 1h5a1 1 0 0 0 1-1v-3a1 1 0 0 0-1-1h-5zM6 8H1v7h5V8zM1 7a1 1 0 0 0-1 1v7a1 1 0 0 0 1 1h5a1 1 0 0 0 1-1V8a1 1 0 0 0-1-1H1zm14-6h-5v7h5V1zm-5-1a1 1 0 0 0-1 1v7a1 1 0 0 0 1 1h5a1 1 0 0 0 1-1V1a1 1 0 0 0-1-1h-5z"/>
                                        </svg>
                                    </span>
                                    <span class="nav-link-text">Service</span>
                                    <span class="submenu-arrow">
                                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-chevron-down" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path fill-rule="evenodd" d="M1.646 4.646a.5.5 0 0 1 .708 0L8 10.293l5.646-5.647a.5.5 0 0 1 .708.708l-6 6a.5.5 0 0 1-.708 0l-6-6a.5.5 0 0 1 0-.708z"/>
                                        </svg>
                                    </span><!--//submenu-arrow-->
                                </a><!--//nav-link-->
                                <div id="submenu-2" class="collapse submenu submenu-2" data-bs-parent="#menu-accordion">
                                    <ul class="submenu-list list-unstyled">
                                        <li class="submenu-item"><a class="submenu-link" href="#">Search</a></li>
                                        <li class="submenu-item"><a class="submenu-link" href="#">Calculate</a></li>
                                        <li class="submenu-item"><a class="submenu-link" href="#">.....</a></li>
                                    </ul>
                                </div>
                            </li><!--//nav-item-->	    
                        </ul><!--//app-menu-->
                    </nav><!--//app-nav-->
                </div><!--//sidepanel-inner-->
            </div><!--//app-sidepanel-->
        </header><!--//app-header-->

        <div class="app-wrapper">

            <div class="app-content pt-3 p-md-3 p-lg-4">
                <div class="container-xl">

                    <h1 class="app-page-title">Overview About Amount Spent By Year</h1>

                    <div class="row g-4 mb-4">
                        <div class="col-6 col-lg-3">
                            <div class="app-card app-card-stat shadow-sm h-100">
                                <div class="app-card-body p-3 p-lg-4">
                                    <h4 class="stats-type mb-1">Total Amount Spent</h4>
                                    <div class="stats-figure">$<%=totalMoney%></div>
                                    <div class="stats-meta text-success">
                                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-arrow-up" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path fill-rule="evenodd" d="M8 15a.5.5 0 0 0 .5-.5V2.707l3.146 3.147a.5.5 0 0 0 .708-.708l-4-4a.5.5 0 0 0-.708 0l-4 4a.5.5 0 1 0 .708.708L7.5 2.707V14.5a.5.5 0 0 0 .5.5z"/>
                                        </svg> 20%</div>
                                </div><!--//app-card-body-->
                                <a class="app-card-link-mask" href="#"></a>
                            </div><!--//app-card-->
                        </div><!--//col-->

                        <div class="col-6 col-lg-3">
                            <div class="app-card app-card-stat shadow-sm h-100">
                                <div class="app-card-body p-3 p-lg-4">
                                    <h4 class="stats-type mb-1">Average Amount Spent</h4>
                                    <div class="stats-figure">$<%=totalMoney / 3%></div>
                                    <div class="stats-meta text-success">
                                        <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-arrow-down" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                        <path fill-rule="evenodd" d="M8 1a.5.5 0 0 1 .5.5v11.793l3.146-3.147a.5.5 0 0 1 .708.708l-4 4a.5.5 0 0 1-.708 0l-4-4a.5.5 0 0 1 .708-.708L7.5 13.293V1.5A.5.5 0 0 1 8 1z"/>
                                        </svg> 5% </div>
                                </div><!--//app-card-body-->
                                <a class="app-card-link-mask" href="#"></a>
                            </div><!--//app-card-->
                        </div><!--//col-->
                        <div class="col-6 col-lg-3">
                            <div class="app-card app-card-stat shadow-sm h-100">
                                <div class="app-card-body p-3 p-lg-4">
                                    <h4 class="stats-type mb-1">Category Number Added</h4>
                                    <div class="stats-figure"><%=numberCate%></div>
                                    <div class="stats-meta">
                                        Open</div>
                                </div><!--//app-card-body-->
                                <a class="app-card-link-mask" href="#"></a>
                            </div><!--//app-card-->
                        </div><!--//col-->
                        <div class="col-6 col-lg-3">
                            <div class="app-card app-card-stat shadow-sm h-100">
                                <div class="app-card-body p-3 p-lg-4">
                                    <h4 class="stats-type mb-1">Number Bill</h4>
                                    <div class="stats-figure"><%=numberBill%></div>
                                    <div class="stats-meta">Bill</div>
                                </div><!--//app-card-body-->
                                <a class="app-card-link-mask" href="#"></a>
                            </div><!--//app-card-->
                        </div><!--//col-->
                    </div><!--//row-->
                    <div class="row g-4 mb-4">
                        <div class="col-12 col-lg-6">
                            <div class="app-card app-card-chart h-100 shadow-sm">
                                <div class="app-card-header p-3">
                                    <div class="row justify-content-between align-items-center">
                                        <div class="col-auto">
                                            <h4 class="app-card-title">Line Chart Of Spending Money By Year</h4>
                                        </div><!--//col-->
                                        <div class="col-auto">
                                            <div class="card-header-action">
                                                <a href="charts.html">More charts</a>
                                            </div><!--//card-header-actions-->
                                        </div><!--//col-->
                                    </div><!--//row-->
                                </div><!--//app-card-header-->
                                <div class="app-card-body p-3 p-lg-4">
                                    <div class="mb-3 d-flex">  
                                        <select class="form-select form-select-sm ms-auto d-inline-flex w-auto">
                                            <option value="1" selected>All</option>
                                            <option value="2">2021</option>
                                            <option value="3">2020</option>
                                            <option value="3">2019</option>
                                        </select>
                                    </div>
                                    <div class="chart-container">
                                        <canvas id="canvas-linechart" ></canvas>
                                    </div>
                                </div><!--//app-card-body-->
                            </div><!--//app-card-->
                        </div><!--//col-->
                        <div class="col-12 col-lg-6">
                            <div class="app-card app-card-stats-table h-100 shadow-sm">
                                <div class="app-card-header p-3">
                                    <div class="row justify-content-between align-items-center">
                                        <div class="col-auto">
                                            <h4 class="app-card-title">List Category</h4>
                                        </div><!--//col-->
                                        <div class="col-auto">
                                            <div class="card-header-action">
                                                <a href="list">View report</a>
                                            </div><!--//card-header-actions-->
                                        </div><!--//col-->
                                    </div><!--//row-->
                                </div><!--//app-card-header-->
                                <div class="app-card-body p-3 p-lg-4">
                                    <div class="table-responsive">
                                        <table class="table table-borderless mb-0">
                                            <thead>
                                                <tr>
                                                    <th class="meta">Menu</th>
                                                    <th class="meta stat-cell">Number Bill</th>
                                                    <th class="meta stat-cell">Total The Amount Spent($)</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    DAOBill_MoneyOut daoBill = new DAOBill_MoneyOut();
                                                    String idManager = (String) session.getAttribute("idManager");
                                                    float totalMoneyCategory = 0;
                                                    int numberMoneyCate = 0;
                                                    while (rsMenu.next()) {
                                                        ResultSet MoneyCategory = daoBill.getTotalMoneySpentForCategory(idManager, rsMenu.getInt(1));
                                                        while (MoneyCategory.next()) {
                                                            totalMoneyCategory += MoneyCategory.getFloat(4);
                                                            numberMoneyCate++;
                                                        }%>
                                                <tr>
                                                    <td><a href="#"><%=rsMenu.getString(2)%></a></td>
                                                    <td class="stat-cell" style="text-align: center;"><%=numberMoneyCate%></td>
                                                    <td class="stat-cell" style="text-align: center;"><%=totalMoneyCategory%></td>
                                                </tr>
                                                <%
                                                        totalMoneyCategory = 0;
                                                        numberMoneyCate = 0;
                                                    }
                                                %>
                                            </tbody>
                                        </table>
                                    </div><!--//table-responsive-->
                                </div><!--//app-card-body-->
                            </div><!--//app-card-->
                        </div><!--//col-->
                    </div><!--//row-->
                    <div class="row g-4 mb-4">
                        <div class="col-12 col-lg-4">
                            <div class="app-card app-card-basic d-flex flex-column align-items-start shadow-sm">
                                <div class="app-card-header p-3 border-bottom-0">
                                    <div class="row align-items-center gx-3">
                                        <div class="col-auto">
                                            <div class="app-icon-holder">
                                                <svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-receipt" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                                                <path fill-rule="evenodd" d="M1.92.506a.5.5 0 0 1 .434.14L3 1.293l.646-.647a.5.5 0 0 1 .708 0L5 1.293l.646-.647a.5.5 0 0 1 .708 0L7 1.293l.646-.647a.5.5 0 0 1 .708 0L9 1.293l.646-.647a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .801.13l.5 1A.5.5 0 0 1 15 2v12a.5.5 0 0 1-.053.224l-.5 1a.5.5 0 0 1-.8.13L13 14.707l-.646.647a.5.5 0 0 1-.708 0L11 14.707l-.646.647a.5.5 0 0 1-.708 0L9 14.707l-.646.647a.5.5 0 0 1-.708 0L7 14.707l-.646.647a.5.5 0 0 1-.708 0L5 14.707l-.646.647a.5.5 0 0 1-.708 0L3 14.707l-.646.647a.5.5 0 0 1-.801-.13l-.5-1A.5.5 0 0 1 1 14V2a.5.5 0 0 1 .053-.224l.5-1a.5.5 0 0 1 .367-.27zm.217 1.338L2 2.118v11.764l.137.274.51-.51a.5.5 0 0 1 .707 0l.646.647.646-.646a.5.5 0 0 1 .708 0l.646.646.646-.646a.5.5 0 0 1 .708 0l.646.646.646-.646a.5.5 0 0 1 .708 0l.646.646.646-.646a.5.5 0 0 1 .708 0l.646.646.646-.646a.5.5 0 0 1 .708 0l.509.509.137-.274V2.118l-.137-.274-.51.51a.5.5 0 0 1-.707 0L12 1.707l-.646.647a.5.5 0 0 1-.708 0L10 1.707l-.646.647a.5.5 0 0 1-.708 0L8 1.707l-.646.647a.5.5 0 0 1-.708 0L6 1.707l-.646.647a.5.5 0 0 1-.708 0L4 1.707l-.646.647a.5.5 0 0 1-.708 0l-.509-.51z"/>
                                                <path fill-rule="evenodd" d="M3 4.5a.5.5 0 0 1 .5-.5h6a.5.5 0 1 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 1 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 1 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 0 1 0 1h-6a.5.5 0 0 1-.5-.5zm8-6a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 0 1h-1a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 0 1h-1a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 0 1h-1a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 0 1h-1a.5.5 0 0 1-.5-.5z"/>
                                                </svg>
                                            </div><!--//icon-holder-->

                                        </div><!--//col-->
                                        <div class="col-auto">
                                            <h4 class="app-card-title">New Bill_Money Spened</h4>
                                        </div><!--//col-->
                                    </div><!--//row-->
                                </div><!--//app-card-header-->
                                <div class="app-card-body px-4">

                                    <div class="intro">Make a new note for the things you spend money</div>
                                </div><!--//app-card-body-->
                                <div class="app-card-footer p-4 mt-auto">
                                    <a class="btn app-btn-secondary" href="add">Create New</a>
                                </div><!--//app-card-footer-->
                            </div><!--//app-card-->
                        </div><!--//col-->
                    </div><!--//row-->
                </div><!--//container-fluid-->
            </div><!--//app-content-->
        </div><!--//app-wrapper-->    					


        <!-- Javascript -->          
        <script src="assets/plugins/popper.min.js"></script>
        <script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>  

        <!-- Charts JS -->
        <script src="assets/plugins/chart.js/chart.min.js"></script> 
        <script src="assets/js/index-charts.js"></script> 

        <!-- Page Specific JS -->
        <script src="assets/js/app.js"></script> 
    </body>
</html> 

