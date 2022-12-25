package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body class=\"app app-signup p-0\">    \t\n");
      out.write("        <div class=\"row g-0 app-auth-wrapper\">\n");
      out.write("            <div class=\"col-12 col-md-7 col-lg-6 auth-main-col text-center p-5\">\n");
      out.write("                <div class=\"d-flex flex-column align-content-end\">\n");
      out.write("                    <div class=\"app-auth-body mx-auto\">\t\n");
      out.write("                        <div class=\"app-auth-branding mb-4\"><a class=\"app-logo\" href=\"index.html\"><img class=\"logo-icon me-2\" src=\"assets/images/app-logo.svg\" alt=\"logo\"></a></div>\n");
      out.write("                        <h2 class=\"auth-heading text-center mb-4\">Sign up to Portal</h2>\t\t\t\t\t\n");
      out.write("\n");
      out.write("                        <div class=\"auth-form-container text-start mx-auto\">\n");
      out.write("                            <form class=\"auth-form auth-signup-form\" action=\"register\" method=\"POST\">         \n");
      out.write("                                <div class=\"email mb-3\">\n");
      out.write("                                    <label class=\"sr-only\" for=\"signup-email\">Your Full Name</label>\n");
      out.write("                                    <input id=\"signup-name\" name=\"fullname\" type=\"text\" class=\"form-control signup-name\" placeholder=\"Enter Full name\" required=\"required\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"email mb-3\">\n");
      out.write("                                    <label class=\"sr-only\" for=\"signup-email\">Your Phone</label>\n");
      out.write("                                    <input id=\"signup-email\" name=\"phone\" type=\"text\" class=\"form-control signup-email\" placeholder=\"Enter Your Phone\" required=\"required\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"password mb-3\">\n");
      out.write("                                    <label class=\"sr-only\" for=\"signup-password\">UserName</label>\n");
      out.write("                                    <input id=\"signup-password\" name=\"username\" type=\"text\" class=\"form-control signup-password\" placeholder=\"Create a UserName\" required=\"required\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"password mb-3\">\n");
      out.write("                                    <label class=\"sr-only\" for=\"signup-password\">Password</label>\n");
      out.write("                                    <input id=\"signup-password\" name=\"password\" type=\"password\" class=\"form-control signup-password\" placeholder=\"Create a password\" required=\"required\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"extra mb-3\">\n");
      out.write("                                    <div class=\"form-check\">\n");
      out.write("                                        <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"RememberPassword\">\n");
      out.write("                                        <label class=\"form-check-label\" for=\"RememberPassword\">\n");
      out.write("                                            I agree to Portal's <a href=\"#\" class=\"app-link\">Terms of Service</a> and <a href=\"#\" class=\"app-link\">Privacy Policy</a>.\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div><!--//extra-->\n");
      out.write("\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn app-btn-primary w-100 theme-btn mx-auto\">Sign Up</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form><!--//auth-form-->\n");
      out.write("\n");
      out.write("                            <div class=\"auth-option text-center pt-5\">Already have an account? <a class=\"text-link\" href=\"login\" >Log in</a></div>\n");
      out.write("                        </div><!--//auth-form-container-->\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div><!--//auth-body-->\n");
      out.write("\n");
      out.write("                    <footer class=\"app-auth-footer\">\n");
      out.write("                        <div class=\"container text-center py-3\">\n");
      out.write("                            <!--/* This template is free as long as you keep the footer attribution link. If you'd like to use the template without the attribution link, you can buy the commercial license via our website: themes.3rdwavemedia.com Thank you for your support. :) */-->\n");
      out.write("                            <small class=\"copyright\">Designed with <i class=\"fas fa-heart\" style=\"color: #fb866a;\"></i> by <a class=\"app-link\" href=\"http://themes.3rdwavemedia.com\" target=\"_blank\">Xiaoying Riley</a> for developers</small>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </footer><!--//app-auth-footer-->\t\n");
      out.write("                </div><!--//flex-column-->   \n");
      out.write("            </div><!--//auth-main-col-->\n");
      out.write("            <div class=\"col-12 col-md-5 col-lg-6 h-100 auth-background-col\">\n");
      out.write("                <div class=\"auth-background-holder\">\t\t\t    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"auth-background-mask\"></div>\n");
      out.write("                <div class=\"auth-background-overlay p-3 p-lg-5\">\n");
      out.write("                    <div class=\"d-flex flex-column align-content-end h-100\">\n");
      out.write("                        <div class=\"h-100\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--//auth-background-overlay-->\n");
      out.write("            </div><!--//auth-background-col-->\n");
      out.write("\n");
      out.write("        </div><!--//row-->\n");
      out.write("\n");
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
