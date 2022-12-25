package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+JP&display=swap');\n");
      out.write("            * {box-sizing: border-box}\n");
      out.write("            body{\n");
      out.write("                font-family: 'Noto Sans JP', sans-serif;\n");
      out.write("            }\n");
      out.write("            h1, label{\n");
      out.write("                color: DodgerBlue;\n");
      out.write("            }\n");
      out.write("            /* Full-width input fields */\n");
      out.write("            input[type=text], input[type=password] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 5px 0 22px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: none;\n");
      out.write("                width:100%;\n");
      out.write("                resize: vertical;\n");
      out.write("                padding:15px;\n");
      out.write("                border-radius:15px;\n");
      out.write("                border:0;\n");
      out.write("                box-shadow:4px 4px 10px rgba(0,0,0,0.2);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=text]:focus, input[type=password]:focus {\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            hr {\n");
      out.write("                border: 1px solid #f1f1f1;\n");
      out.write("                margin-bottom: 25px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Set a style for all buttons */\n");
      out.write("            button {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 100%;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:hover {\n");
      out.write("                opacity:1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Extra styles for the cancel button */\n");
      out.write("            .cancelbtn {\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                background-color: #f44336;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Float cancel and signup buttons and add an equal width */\n");
      out.write("            .signupbtn {\n");
      out.write("                float: left;\n");
      out.write("                width: 100%;\n");
      out.write("                border-radius:15px;\n");
      out.write("                border:0;\n");
      out.write("                box-shadow:4px 4px 10px rgba(0,0,0,0.2);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Add padding to container elements */\n");
      out.write("            .container {\n");
      out.write("                padding: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Clear floats */\n");
      out.write("            .clearfix::after {\n");
      out.write("                content: \"\";\n");
      out.write("                clear: both;\n");
      out.write("                display: table;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"\" >\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>Update Information</h1>\n");
      out.write("                <hr>\n");
      out.write("                <input type=\"hidden\" placeholder=\"\" name=\"email\" required>\n");
      out.write("\n");
      out.write("                <label for=\"note\"><b>Note</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Note\" name=\"note\" required>\n");
      out.write("\n");
      out.write("                <label for=\"date\"><b>Date</b></label>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"date\" name=\"date\"  style=\"margin-bottom:30px; border: none;padding: 10px;box-shadow: 2px 5px gainsboro; border-radius: 20px;\" required>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <label for=\"money\"><b>Money Spent</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Money Spent\" name=\"money\" required>\n");
      out.write("\n");
      out.write("                <label for=\"email\"><b>Category</b></label>\n");
      out.write("                <select name=\"idcate\">\n");
      out.write("                    <option></option>\n");
      out.write("                    <option></option>\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                <input type=\"hidden\" name=\"manager\" required>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\">\n");
      out.write("                    <button type=\"submit\" class=\"signupbtn\">Update</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
