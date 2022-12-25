package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body class=\"app app-login p-0\">    \t\n");
      out.write("        <div class=\"row g-0 app-auth-wrapper\">\n");
      out.write("            <div class=\"col-12 col-md-7 col-lg-6 auth-main-col text-center p-5\">\n");
      out.write("                <div class=\"d-flex flex-column align-content-end\">\n");
      out.write("                    <div class=\"app-auth-body mx-auto\">\t\n");
      out.write("                        <div class=\"app-auth-branding mb-4\"><a class=\"app-logo\" href=\"index.html\"><img class=\"logo-icon me-2\" src=\"assets/images/app-logo.svg\" alt=\"logo\"></a></div>\n");
      out.write("                        <h2 class=\"auth-heading text-center mb-5\">Log in to Portal</h2>\n");
      out.write("                        <div class=\"auth-form-container text-start\">\n");
      out.write("                            <form class=\"auth-form login-form\">         \n");
      out.write("                                <div class=\"email mb-3\">\n");
      out.write("                                    <label class=\"sr-only\" for=\"signin-email\">Email</label>\n");
      out.write("                                    <input id=\"signin-email\" name=\"signin-email\" type=\"email\" class=\"form-control signin-email\" placeholder=\"Email address\" required=\"required\">\n");
      out.write("                                </div><!--//form-group-->\n");
      out.write("                                <div class=\"password mb-3\">\n");
      out.write("                                    <label class=\"sr-only\" for=\"signin-password\">Password</label>\n");
      out.write("                                    <input id=\"signin-password\" name=\"signin-password\" type=\"password\" class=\"form-control signin-password\" placeholder=\"Password\" required=\"required\">\n");
      out.write("                                    <div class=\"extra mt-3 row justify-content-between\">\n");
      out.write("                                        <div class=\"col-6\">\n");
      out.write("                                            <div class=\"form-check\">\n");
      out.write("                                                <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"RememberPassword\">\n");
      out.write("                                                <label class=\"form-check-label\" for=\"RememberPassword\">\n");
      out.write("                                                    Remember me\n");
      out.write("                                                </label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div><!--//col-6-->\n");
      out.write("                                        <div class=\"col-6\">\n");
      out.write("                                            <div class=\"forgot-password text-end\">\n");
      out.write("                                                <a href=\"reset-password.html\">Forgot password?</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div><!--//col-6-->\n");
      out.write("                                    </div><!--//extra-->\n");
      out.write("                                </div><!--//form-group-->\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn app-btn-primary w-100 theme-btn mx-auto\">Log In</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                            <div class=\"auth-option text-center pt-5\">No Account? Sign up <a class=\"text-link\" href=\"signup.html\" >here</a>.</div>\n");
      out.write("                        </div><!--//auth-form-container-->\t\n");
      out.write("\n");
      out.write("                    </div><!--//auth-body-->\n");
      out.write("                </div><!--//flex-column-->   \n");
      out.write("            </div><!--//auth-main-col-->\n");
      out.write("            \n");
      out.write("        </div><!--//row-->\n");
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
