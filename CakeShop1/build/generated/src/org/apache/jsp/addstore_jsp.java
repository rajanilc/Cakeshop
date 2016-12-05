package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addstore_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  \r\n");
      out.write("<head>\r\n");
      out.write("<title>Cake Shop</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles1.css\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write(" <body>  \r\n");
      out.write("     \r\n");
      out.write("     ");

     String user=request.getParameter("user");
     
      out.write("\r\n");
      out.write("       <div class=\"container\">\r\n");
      out.write("  <div class=\"navbar\">\r\n");
      out.write("\t         <div class=\"navbar-inner\">\r\n");
      out.write("\t           \r\n");
      out.write("\t             <ul class=\"nav\">\r\n");
      out.write("                         <li class=\"active\"><a href=\"admin.jsp\"><b>Home</b></a></li>\r\n");
      out.write("                         <li class=\"\"><a href=\"existing.html\"><b>Add Customer Order</b></a></li>\r\n");
      out.write("                         <li class=\"\"><a href=\"existing.html\"><b>Delete Customer Order</b></a></li>\r\n");
      out.write("                         <li class=\"\"><a href=\"existing.html\"><b>Update Customer Order</b></a></li>\r\n");
      out.write("                         <li class=\"\"><a href=\"admin.jsp\"><b>Back</b></a></li>\r\n");
      out.write("                          <li class=\"\"><a href=\"logout.jsp\"><b>Logout</b></a></li>\r\n");
      out.write("                          </ul>\r\n");
      out.write("                 </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("         <div class=\"span4\">\r\n");
      out.write("\t       \t\t<ul class=\"nav nav-list\">\r\n");
      out.write("    <li class=\"active\"><a href=\"admin.jsp\"><b>Home</b></a></li>\r\n");
      out.write("    <li class=\"\"><a href=\"addstore.jsp\"><b>Add products to Store</b></a></li>\r\n");
      out.write("                         <li class=\"\"><a href=\"delstore.jsp\"><b>Delete products from Store</b></a></li>\r\n");
      out.write("                         <li class=\"\"><a href=\"updatestore.html\"><b>Update products to Store</b></a></li>\r\n");
      out.write("                         <li class=\"\"><a href=\"existing.html\"><b>Add Customer Order</b></a></li>\r\n");
      out.write("                         <li class=\"\"><a href=\"existing.html\"><b>Delete Customer Order</b></a></li>\r\n");
      out.write("                         <li class=\"\"><a href=\"existing.html\"><b>Update Customer Order</b></a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\t       \t</div>\r\n");
      out.write("     \r\n");
      out.write("  <div class=\"span8\">\r\n");
      out.write("      <section class=\"group6\">\r\n");
      out.write("<form method=\"post\" class=\"searchform\" action=\"submitprodtodb.jsp\">\r\n");
      out.write("<fieldset>\r\n");
      out.write("    <legend><h5>Add Products to Store!</h5></legend>\r\n");
      out.write("                        <table>\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td> Cake Name: </td>\r\n");
      out.write("                                <td> <input type=\"text\" name=\"cakename\" /> </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                             <tr>\r\n");
      out.write("                                <td> Cake Category: </td>\r\n");
      out.write("                                <td>  <select name=\"cakecategory\">\r\n");
      out.write("                                            <option value=\"flavour\" selected>Flavour Cakes</option>\r\n");
      out.write("                                            <option value=\"theme\" selected>Theme Cakes</option>\r\n");
      out.write("                                            <option value=\"addon\" selected>Add Ons</option>\r\n");
      out.write("                                            <option value=\"photo\" selected>Photo Cakes</option>\r\n");
      out.write("                                    </select> </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                             <tr>\r\n");
      out.write("                                <td> Cake Type </td>\r\n");
      out.write("                                <td>  <select name=\"caketype\">\r\n");
      out.write("                                            <option value=\"cream\" selected>Cream Cakes</option>\r\n");
      out.write("                                            <option value=\"eggless\" selected>Eggless Cakes</option>\r\n");
      out.write("                                            <option value=\"special\" selected>Special Cakes</option>\r\n");
      out.write("                                            <option value=\"premium\" selected>Premium Cakes</option>\r\n");
      out.write("                                            <option value=\"mousse\" selected>Mousse Cakes</option>\r\n");
      out.write("                                            <option value=\"cheese\" selected>Cheese Cakes</option>\r\n");
      out.write("                                            <option value=\"two_tier\" selected>Two Tier Cakes</option>\r\n");
      out.write("                                            <option value=\"three_tier\" selected>Three Tier Cakes</option>\r\n");
      out.write("                                            <option value=\"cartoon\" selected>Cartoon Cakes</option>\r\n");
      out.write("                                            <option value=\"heart\" selected>Heart Cakes</option>\r\n");
      out.write("                                            <option value=\"wedding\" selected>Wedding Cakes</option>\r\n");
      out.write("                                            <option value=\"birthday\" selected>Birthday Cakes</option>\r\n");
      out.write("                                    </select> </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Image URL(Format: images/..) </td>\r\n");
      out.write("                              <td>  <input type=\"text\" name=\"cakeimage\" /> </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td> Original Cake Price: </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"cakeprice\" size=10 class=\"s\" /> </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td> Discounted Cake Price: </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <input type=\"text\" name=\"cakeprice1\" size=10 class=\"s\" /> </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td> Cake Unit: </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <select name=\"cakeunit\">\r\n");
      out.write("                                            <option value=\"Half Kg\" selected>Half Kg</option>\r\n");
      out.write("                                            <option value=\"One Kg\" selected>One Kg</option>\r\n");
      out.write("                                            <option value=\"One point 5 Kg\" selected>One point 5 Kg</option>\r\n");
      out.write("                                            <option value=\"Two Kg\" selected>Two Kg</option>\r\n");
      out.write("                                    </select> </td>\r\n");
      out.write("                               \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td> Number of Items: </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                   <input type=\"number\" min=1 name=\"numItems\" size=10 class=\"s\" /> </td>\r\n");
      out.write("                               \r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                   \r\n");
      out.write("                                    <input type=\"submit\" value=\"Add To Store\" class=\"btn btn-info1 active\" /> </td>\r\n");
      out.write("                                <td></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </table></fieldset>\r\n");
      out.write("                    </form>\r\n");
      out.write("      </section>\r\n");
      out.write("\t </div>\r\n");
      out.write("      \r\n");
      out.write("     <footer>\r\n");
      out.write("\t\r\n");
      out.write("        <div class=\"footer-content\">\r\n");
      out.write("            <ul>\r\n");
      out.write("            \t<li><h4>Cake Shop</h4></li>\r\n");
      out.write("                <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("                <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("                <li><a href=\"#\">Delivery Policy</a></li>\r\n");
      out.write("                <li><a href=\"#\">Terms & Conditions</a></li>\r\n");
      out.write("                \r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("            \r\n");
      out.write("            <ul>\r\n");
      out.write("            \t<li><h4>Shop</h4></li>\r\n");
      out.write("                <li><a href=\"#\">Birthday Cakes</a></li>\r\n");
      out.write("                <li><a href=\"#\">Christmas Cakes</a></li>\r\n");
      out.write("                <li><a href=\"#\">Wedding Cakes</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("            \r\n");
      out.write("            <ul>\r\n");
      out.write("            \t<li><h4>Customer Service </h4></li>\r\n");
      out.write("                <li><a href=\"#\">About your Order</a></li>\r\n");
      out.write("                 <li><a href=\"#\">Reviews/Complaints</a></li>\r\n");
      out.write("                \r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("            <ul>\r\n");
      out.write("            \t<li><h4>Connect with Us</h4></li>\r\n");
      out.write("                <li>\r\n");
      out.write("                <img src=\"images/fb.png\" alt=\"\"/>  </li>\r\n");
      out.write("                <li><img src=\"images/twitter.jpg\" alt=\"\"/> </li>\r\n");
      out.write("               \r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("           \r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("        <div class=\"footer-bottom\">\r\n");
      out.write("            <p> <span>&copy; 2015 All Rights Reserved </span>&nbsp;&nbsp;|&nbsp;&nbsp; CSP 595 Cake Website by Team 17</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("    </footer>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("     \r\n");
      out.write("        </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
