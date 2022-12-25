package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import model.DAOBill_MoneyOut;

public final class report_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\"> \n");
      out.write("    <head>\n");
      out.write("        <title>Portal - Bootstrap 5 Admin Dashboard Template For Developers</title>\n");
      out.write("\n");
      out.write("        <!-- Meta -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"Portal - Bootstrap 5 Admin Dashboard Template For Developers\">\n");
      out.write("        <meta name=\"author\" content=\"Xiaoying Riley at 3rd Wave Media\">    \n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\"> \n");
      out.write("\n");
      out.write("        <!-- FontAwesome JS-->\n");
      out.write("        <script defer src=\"assets/plugins/fontawesome/js/all.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- App CSS -->  \n");
      out.write("        <link id=\"theme-style\" rel=\"stylesheet\" href=\"assets/css/portal.css\">\n");
      out.write("\n");
      out.write("    </head> \n");
      out.write("\n");
      out.write("    <body class=\"app\">   \t\n");
      out.write("        <header class=\"app-header fixed-top\">\t   \t            \n");
      out.write("            <div class=\"app-header-inner\">  \n");
      out.write("                <div class=\"container-fluid py-2\">\n");
      out.write("                    <div class=\"app-header-content\"> \n");
      out.write("                        <div class=\"row justify-content-between align-items-center\">\n");
      out.write("                            <div class=\"col-auto\">\n");
      out.write("                                <a id=\"sidepanel-toggler\" class=\"sidepanel-toggler d-inline-block d-xl-none\" href=\"#\">\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"30\" height=\"30\" viewBox=\"0 0 30 30\" role=\"img\"><title>Menu</title><path stroke=\"currentColor\" stroke-linecap=\"round\" stroke-miterlimit=\"10\" stroke-width=\"2\" d=\"M4 7h22M4 15h22M4 23h22\"></path></svg>\n");
      out.write("                                </a>\n");
      out.write("                            </div><!--//col-->\n");
      out.write("                            <div style=\"text-align: center;\">\n");
      out.write("                                <h3>---- Expense Report ----</h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div><!--//row-->\n");
      out.write("                    </div><!--//app-header-content-->\n");
      out.write("                </div><!--//container-fluid-->\n");
      out.write("            </div><!--//app-header-inner-->\n");
      out.write("            <div id=\"app-sidepanel\" class=\"app-sidepanel sidepanel-hidden\"> \n");
      out.write("                <div id=\"sidepanel-drop\" class=\"sidepanel-drop\"></div>\n");
      out.write("                <div class=\"sidepanel-inner d-flex flex-column\">\n");
      out.write("                    <a href=\"#\" id=\"sidepanel-close\" class=\"sidepanel-close d-xl-none\">&times;</a>\n");
      out.write("                    <div class=\"app-branding\">\n");
      out.write("                        <a class=\"app-logo\" href=\"home\"><img class=\"logo-icon me-2\" src=\"assets/images/app-logo.svg\" alt=\"logo\"><span class=\"logo-text\">PORTAL</span></a>\n");
      out.write("\n");
      out.write("                    </div><!--//app-branding-->  \n");
      out.write("                    <nav id=\"app-nav-main\" class=\"app-nav app-nav-main flex-grow-1\">\n");
      out.write("                        <ul class=\"app-menu list-unstyled accordion\" id=\"menu-accordion\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <!--//Bootstrap Icons: https://icons.getbootstrap.com/ -->\n");
      out.write("                                <a class=\"nav-link\" href=\"list\">\n");
      out.write("                                    <span class=\"nav-icon\">\n");
      out.write("                                        <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-house-door\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                                        <path fill-rule=\"evenodd\" d=\"M7.646 1.146a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 .146.354v7a.5.5 0 0 1-.5.5H9.5a.5.5 0 0 1-.5-.5v-4H7v4a.5.5 0 0 1-.5.5H2a.5.5 0 0 1-.5-.5v-7a.5.5 0 0 1 .146-.354l6-6zM2.5 7.707V14H6v-4a.5.5 0 0 1 .5-.5h3a.5.5 0 0 1 .5.5v4h3.5V7.707L8 2.207l-5.5 5.5z\"/>\n");
      out.write("                                        <path fill-rule=\"evenodd\" d=\"M13 2.5V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z\"/>\n");
      out.write("                                        </svg>\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"nav-link-text\">Back</span>\n");
      out.write("                                </a><!--//nav-link-->\n");
      out.write("                            </li><!--//nav-item-->\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <!--//Bootstrap Icons: https://icons.getbootstrap.com/ -->\n");
      out.write("                                <a class=\"nav-link\" href=\"docs.html\">\n");
      out.write("                                    <span class=\"nav-icon\">\n");
      out.write("                                        <svg width=\"1em\" height=\"1em\" viewBox=\"0 0 16 16\" class=\"bi bi-folder\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                                        <path d=\"M9.828 4a3 3 0 0 1-2.12-.879l-.83-.828A1 1 0 0 0 6.173 2H2.5a1 1 0 0 0-1 .981L1.546 4h-1L.5 3a2 2 0 0 1 2-2h3.672a2 2 0 0 1 1.414.586l.828.828A2 2 0 0 0 9.828 3v1z\"/>\n");
      out.write("                                        <path fill-rule=\"evenodd\" d=\"M13.81 4H2.19a1 1 0 0 0-.996 1.09l.637 7a1 1 0 0 0 .995.91h10.348a1 1 0 0 0 .995-.91l.637-7A1 1 0 0 0 13.81 4zM2.19 3A2 2 0 0 0 .198 5.181l.637 7A2 2 0 0 0 2.826 14h10.348a2 2 0 0 0 1.991-1.819l.637-7A2 2 0 0 0 13.81 3H2.19z\"/>\n");
      out.write("                                        </svg>\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"nav-link-text\">Result</span>\n");
      out.write("                                </a><!--//nav-link-->\n");
      out.write("                            </li><!--//nav-item-->\n");
      out.write("                        </ul><!--//app-menu-->\n");
      out.write("                    </nav><!--//app-nav-->\n");
      out.write("                </div><!--//sidepanel-inner-->\n");
      out.write("            </div><!--//app-sidepanel-->\n");
      out.write("        </header><!--//app-header-->\n");
      out.write("\n");
      out.write("        <div class=\"app-wrapper\">\n");
      out.write("            <div class=\"app-content pt-3 p-md-3 p-lg-4\">\n");
      out.write("                <div class=\"container-xl\">\n");
      out.write("                    <nav id=\"orders-table-tab\" class=\"orders-table-tab app-nav-tabs nav shadow-sm flex-column flex-sm-row mb-4\">\n");
      out.write("                        <a class=\"flex-sm-fill text-sm-center nav-link active\" id=\"orders-all-tab\" data-bs-toggle=\"tab\" href=\"#orders-all\" role=\"tab\" aria-controls=\"orders-all\" aria-selected=\"true\">Report</a>\n");
      out.write("                    </nav>\n");
      out.write("                    <div class=\"tab-content\" id=\"orders-table-tab-content\">\n");
      out.write("                        <div class=\"tab-pane fade show active\" id=\"orders-all\" role=\"tabpanel\" aria-labelledby=\"orders-all-tab\">\n");
      out.write("                            <div class=\"app-card app-card-orders-table shadow-sm mb-5\">\n");
      out.write("                                <div class=\"app-card-body\">\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"table-responsive\" style=\"overflow:visible;\">\n");
      out.write("                                        <table class=\"table app-table-hover mb-0 text-left\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th class=\"cell\">STT</th>\n");
      out.write("                                                    <th class=\"cell\">Year</th>\n");
      out.write("                                                    <th class=\"cell\">Total</th>\n");
      out.write("                                                    <th class=\"cell\">Category Name</th>\n");
      out.write("                                                    <th class=\"cell\" style=\"text-align: center;\">Number Category</th>\n");
      out.write("                                                    <th class=\"cell\" style=\"text-align: center;\">Number Bill</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td class=\"cell\">#15341</td>\n");
      out.write("                                                    <td class=\"cell\">2020</td>\n");
      out.write("                                                    <td class=\"cell\">$678.26</td>\n");
      out.write("                                                    <td class=\"cell\">\n");
      out.write("                                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dropdown.jsp", out, false);
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"cell\" style=\"text-align: center;\">8</td>\n");
      out.write("                                                    <td class=\"cell\" style=\"text-align: center;\">9</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div><!--//table-responsive-->\n");
      out.write("                                </div><!--//app-card-body-->\t\t\n");
      out.write("                            </div><!--//app-card-->\n");
      out.write("                        </div><!--//tab-pane-->\n");
      out.write("                </div><!--//container-fluid-->\n");
      out.write("            </div><!--//app-content-->\n");
      out.write("        </div><!--//app-wrapper-->    \t\t\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Javascript -->          \n");
      out.write("        <script src=\"assets/plugins/popper.min.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/bootstrap/js/bootstrap.min.js\"></script>  \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Page Specific JS -->\n");
      out.write("        <script src=\"assets/js/app.js\"></script> \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html> \n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
