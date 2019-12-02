package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Menu_offline.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"/css/style_1.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body style=\"background-color: #424242\">\n");
      out.write("       ");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<style >\n");
      out.write("\n");
      out.write("\n");
      out.write("    .contenedor{\n");
      out.write("        position: relative;\n");
      out.write("        display: inline-block;\n");
      out.write("        text-align: left;\n");
      out.write("        font-family: 'Calistoga', cursive;\n");
      out.write("        background-image: url('imagenes/menu3.jpg');\n");
      out.write("        height: 400px;\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    .menu{\n");
      out.write("        position: absolute;\n");
      out.write("        top: 20px;\n");
      out.write("        left:10px;\n");
      out.write("        background-color: #424242;\n");
      out.write("\n");
      out.write("        border-radius: 15px; \n");
      out.write("\n");
      out.write("        font-size: 1.5rem;\n");
      out.write("        opacity: 0.80;\n");
      out.write("        height: 3.5rem;\n");
      out.write("        width: 80%;\n");
      out.write("\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"contenedor col-12\" style=\" \">\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-8\">\n");
      out.write("            <ul class=\"nav menu \">\n");
      out.write("                <li class=\"nav-item \">\n");
      out.write("                    <a class=\"nav-link active\" href=\"Inicio.jsp\" style=\"color: #fff;\" href=\"#\">Tio Juanito</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color: #fff;\" href=\"#\">Rutas</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color: #fff;\" href=\"#\">Colegios</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color: #fff;\" href=\"#\">Contáctanos</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-4\">\n");
      out.write("            <ul class=\"nav menu \">\n");
      out.write("                <li class=\"nav-item\" style=\"right: 50px\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color: #fff;\" href=\"#\">Login</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\" style=\"right: 50px\">\n");
      out.write("                    <a class=\"nav-link\" style=\"color: #fff;\" href=\"#\">Regístrate</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\" style=\"background-color: #dbeddc; border-radius: 15px;\">\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\" style=\"background-color:#dbeddc; border-radius: 15px;\">\n");
      out.write("                    <br>\n");
      out.write("                    <form role=\"form\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <label for=\"exampleInputEmail1\">\n");
      out.write("                                Usuario o correo electrónico\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <label for=\"exampleInputPassword1\">\n");
      out.write("                                Clave\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">\n");
      out.write("                            Submit\n");
      out.write("                        </button>\n");
      out.write("                    </form>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\".../js/jquery.min.js\"></script>\n");
      out.write("        <script src=\".../js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\".../js/scripts.js\"></script>\n");
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
