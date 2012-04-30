package org.apache.jsp.jalil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class analysis_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Data Analysis</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"title\" content=\"Web site\" />\n");
      out.write("        <meta name=\"description\" content=\"Site description here\" />\n");
      out.write("        <meta name=\"keywords\" content=\"keywords here\" />\n");
      out.write("        <meta name=\"language\" content=\"en\" />\n");
      out.write("        <meta name=\"subject\" content=\"Site subject here\" />\n");
      out.write("        <meta name=\"robots\" content=\"All\" />\n");
      out.write("        <meta name=\"copyright\" content=\"Your company\" />\n");
      out.write("        <meta name=\"abstract\" content=\"Site description here\" />\n");
      out.write("        <meta name=\"MSSmartTagsPreventParsing\" content=\"true\" />\n");
      out.write("        <link id=\"theme\" rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" title=\"theme\" />\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"js/custom.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"js/addon.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <div id=\"top\"> \n");
      out.write("            <div class=\"overlay\"></div> \n");
      out.write("        </div>  \n");
      out.write("        <div id=\"wrapper\"> \n");
      out.write("            <div class=\"overlay\"></div>  \n");
      out.write("            <div class=\"border-top\"></div>  \n");
      out.write("            <div class=\"content\"> \n");
      out.write("                <div id=\"container\"> \n");
      out.write("                    <div class=\"hd\"> \n");
      out.write("                        <div id=\"container-top\"></div>  \n");
      out.write("                        <div id=\"banner\"></div>  \n");
      out.write("                        <div id=\"hmenu-wpr\"> \n");
      out.write("                            <ul id=\"hmenu\" class=\"sf-menu sf-js-enabled sf-shadow\">\n");
      out.write("                                <li> \n");
      out.write("                                    <a class=\"toplvl sf-with-ul\" href=\"../index.jsp\">Home</a> \n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"current\" style=\"border:none\"> \n");
      out.write("                                    <a href=\"#\" class=\"toplvl\">Analysis</a>  \n");
      out.write("                                </li>\n");
      out.write("                                <li> \n");
      out.write("                                    <a class=\"toplvl\" href=\"#\">Services</a>  \n");
      out.write("                                    <!--<ul>\n");
      out.write("                                    <li> \n");
      out.write("                                       <a href=\"#\">menu item</a> \n");
      out.write("                                     </li>\n");
      out.write("                                     <li class=\"current\"> \n");
      out.write("                                       <a href=\"#\">menu item</a>  \n");
      out.write("                                       <ul>\n");
      out.write("                                         <li class=\"current\">\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                       </ul> \n");
      out.write("                                     </li>\n");
      out.write("                                     <li> \n");
      out.write("                                       <a href=\"#\">menu item</a>  \n");
      out.write("                                       <ul>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                       </ul> \n");
      out.write("                                     </li>\n");
      out.write("                                     <li> \n");
      out.write("                                       <a href=\"#\">menu item</a>  \n");
      out.write("                                       <ul>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                         <li>\n");
      out.write("                                           <a href=\"#\">menu item</a>\n");
      out.write("                                         </li>\n");
      out.write("                                       </ul> \n");
      out.write("                                     </li>\n");
      out.write("                                   </ul> -->\n");
      out.write("                                </li>\n");
      out.write("                                <li> \n");
      out.write("                                    <a class=\"toplvl\" href=\"#\">About Us</a> \n");
      out.write("                                </li>\n");
      out.write("                                <li style=\"\"> \n");
      out.write("                                    <a class=\"toplvl\" href=\"jalil/Yourprofile.jsp\">Jalil</a>  \n");
      out.write("                                    <ul>\n");
      out.write("                                        <li> \n");
      out.write("                                            <a href=\"jalil/Yourprofile.jsp\">Profile Settings</a> \n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"current\"> \n");
      out.write("                                            <a href=\"index.jsp\">Log out</a>  \n");
      out.write("\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul> \n");
      out.write("                        </div> \n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"bd\"> \n");
      out.write("                        <div id=\"page\"> \n");
      out.write("                            <!-- MAIN COLUMN -->  \n");
      out.write("                            <div id=\"main\"> \n");
      out.write("                                <div class=\"content\"> \n");
      out.write("                                    <h1>Analysis</h1>  \n");
      out.write("                                    <h3></h3>  \n");
      out.write("                                    <!--<p> \n");
      out.write("                                      <img src=\"images/bizwoman-1.png\" style=\"float:right;margin-left:20px\" /> Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi.\n");
      out.write("                                    </p>-->  \n");
      out.write("                                    <h2 style=\"margin-top:35px;\">Analysis Reports</h2>  \n");
      out.write("                                    <p>System gets data from different users which belongs to different regions. System utilizes this data to create analysis report considering various aspects.</p>  \n");
      out.write("                                    <p>These report couls later b used for different purposes. for example to evaluate the current impact of different campaigns etc. .</p>  \n");
      out.write("                                    <p>Or this Data may later be used for higher purposes like to make decisions atgovernmnetlevel to eradicateand tackle the health care situation in Pakistan particularly in the remote areas of pakistan. </p>\n");
      out.write("                                    <div style=\"margin-top:25px;\"> \n");
      out.write("                                        <!-- TO REMOVE -->  \n");
      out.write("                                        <h3>Importance</h3>  \n");
      out.write("                                        <p>73 Infants out of every thousand die before their first birthday</p>\n");
      out.write("                                        <p>400 mothers died due to complications of pregnancy per 100,000 live births in 2004-05</p>\n");
      out.write("                                        <p>Hundreds of people die every week through various diseases</p>\n");
      out.write("\n");
      out.write("                                        <br></br>\n");
      out.write("                                        <p><div><img src=\"BarGraph.png\"></img></div></p>\n");
      out.write("                                    </div> \n");
      out.write("                                </div> \n");
      out.write("                            </div> \n");
      out.write("\n");
      out.write("                            <!-- END MAIN -->  \n");
      out.write("                            <!-- SIDEBAR  --> \n");
      out.write("\n");
      out.write("                            <div id=\"sidebar\"> \n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <div class=\"sidebox1\"> \n");
      out.write("                                        <h2>Menu</h2>  \n");
      out.write("                                        <div class=\"vmenu\"> \n");
      out.write("                                            <ul>\n");
      out.write("                                                <li>\n");
      out.write("                                                    <a href=\"disease.html\">Disease</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li>\n");
      out.write("                                                    <a href=\"vaccination.html\">Vaccination</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li>\n");
      out.write("                                                    <a href=\"geo.html\">Geographical Distribution</a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li>\n");
      out.write("                                                    <a href=\"disease.html\">Data</a>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul> \n");
      out.write("                                        </div> \n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("                            </div>  \n");
      out.write("                            <!-- END SIDEBAR  -->  \n");
      out.write("                            <div class=\"clear\" style=\"height:60px\"></div> \n");
      out.write("                        </div> \n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"ft\"> \n");
      out.write("                        <div id=\"footer\"> \n");
      out.write("                            <div class=\"content\"> \n");
      out.write("                                <p>\n");
      out.write("                                    <a href=\"#\">Hyder</a> &nbsp;Developed By Rifa.\n");
      out.write("                                </p> \n");
      out.write("                            </div> \n");
      out.write("                        </div>  \n");
      out.write("                        <div id=\"container-bottom\"></div> \n");
      out.write("                    </div> \n");
      out.write("                </div> \n");
      out.write("            </div> \n");
      out.write("        </div>  \n");
      out.write("        <div class=\"clear\"></div> \n");
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
