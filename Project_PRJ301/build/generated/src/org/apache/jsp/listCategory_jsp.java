package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import model.DAOBill_MoneyOut;

public final class listCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            DAOBill_MoneyOut daoBill = new DAOBill_MoneyOut();
            String idMana = (String) session.getAttribute("idMana");
            ResultSet rsCate = daoBill.getCatagoryUse(idMana);
        
      out.write("\n");
      out.write("        <div style=\"width: 300px; height: 39px; background-color: white; border-radius: 2px; border-bottom: 2px solid #15A362;\">\n");
      out.write("            <h6 style=\"padding: 6px 0px; color: #15A362; text-align: center;\">Year</h6>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"margin-top: 25px;\">\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"width: 300px; height: 37.5px; background-color: white; margin-bottom: 10px; border-radius: 5px 5px 0px 0px; padding-left: 10px;\">List Category</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody style=\"margin-top: 2px;\">\n");
      out.write("                    ");

                        int stt = 1;
                        while (rsCate.next()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"height: 52px;background-color: white; padding-left: 10px;\">");
      out.print(stt);
      out.write(" - ");
      out.print(rsCate.getString(1));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                            stt++;
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
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
