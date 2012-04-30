package org.apache.jsp.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class OutgoingMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>OutGoing Message</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"view.css\" media=\"all\">\n");
      out.write("        <script type=\"text/javascript\" src=\"view.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body id=\"main_body\" >\n");
      out.write("\n");
      out.write("        <img id=\"top\" src=\"top.png\" alt=\"\">\n");
      out.write("        <div id=\"form_container\">\n");
      out.write("\n");
      out.write("            <h1>Message</h1>\n");
      out.write("\n");
      out.write("            <form id=\"message\" class=\"appnitro\"  method=\"post\" action=\"../Controller\">\n");
      out.write("                <div class=\"form_description\">\n");
      out.write("                    <h2>Message</h2>\n");
      out.write("                </div>\t\t\t\t\t\t\n");
      out.write("                <ul >\n");
      out.write("\n");
      out.write("                    <!--<li class=\"section_break\">\n");
      out.write("                        <h3></h3>\n");
      out.write("\n");
      out.write("                        <p></p>\n");
      out.write("                    </li>-->\n");
      out.write("                    <li id=\"li_7\" >\n");
      out.write("                        <!--<label class=\"description\" for=\"element_8\"> </label>-->\n");
      out.write("                        <span>\n");
      out.write("                            <input type=\"text\" id=\"phn_number\" name= \"phn_number\" class=\"element text\" maxlength=\"255\" size=\"14\" value=\"\"/>\n");
      out.write("                            <label>phone Number</label>\n");
      out.write("                        </span>\n");
      out.write("                        </li>\n");
      out.write("                     <li id=\"li_7\">   \n");
      out.write("                        <span>\n");
      out.write("                            <textarea id=\"outgoing_message\" name=\"outgoing_message\" class=\"element textarea medium\" style=\"min-width: 300px\"></textarea>\n");
      out.write("                            <label>Message</label>\n");
      out.write("                        </span> \n");
      out.write("                </li>\n");
      out.write("                    <li class=\"buttons\">\n");
      out.write("                        <input type=\"hidden\" name=\"page_id\" value=\"outgoing_message_page\" />\n");
      out.write("\n");
      out.write("                        <input id=\"send_message\" class=\"button_text\" type=\"submit\" name=\"submit\" value=\"Submit\" />\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </form>\t\n");
      out.write("            <div id=\"footer\">\n");
      out.write("\n");
      out.write("\t\t\tAll rights reserved by team Core a3\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <img id=\"bottom\" src=\"bottom.png\" alt=\"\">\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
