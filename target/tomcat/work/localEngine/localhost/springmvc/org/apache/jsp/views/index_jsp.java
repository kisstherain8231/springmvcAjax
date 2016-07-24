package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<html>\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<body>\r\n");
      out.write("\t<h2>Hello World!</h2>\r\n");
      out.write("\t");
      out.print(path);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"views/doLogin.do\" method=\"post\">\r\n");
      out.write("\t\tname :<input type=\"text\" name=\"name\"> <br /> pwd : <input\r\n");
      out.write("\t\t\ttype=\"text\" name=\"pwd\"> <br /> <input type=\"submit\"\r\n");
      out.write("\t\t\tvalue=\"submit\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"views/jsonLogin.do\" method=\"post\">\r\n");
      out.write("\t\tname :<input type=\"text\" name=\"name\"> <br /> pwd : <input\r\n");
      out.write("\t\t\ttype=\"text\" name=\"pwd\"> <br /> <input type=\"button\"\r\n");
      out.write("\t\t\tid=\"setValue\" value=\"setValue\"> <input type=\"button\"\r\n");
      out.write("\t\t\tid=\"cancle\" value=\"cancle\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.0.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#setValue\").click(function() {\r\n");
      out.write("\t\t\t//$(this).hide();\r\n");
      out.write("\t\t\tsubmitData(1);\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#cancle\").click(function() {\r\n");
      out.write("\t\t\t//$(this).hide();\r\n");
      out.write("\t\t\tsubmitData(0);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction submitData(actionVal) {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\r\n");
      out.write("\t\t\ttype : 'POST',\r\n");
      out.write("\r\n");
      out.write("\t\t\turl : \"views/jsonLogin.do\",\r\n");
      out.write("\r\n");
      out.write("\t\t\tdata : {action : actionVal},\r\n");
      out.write("\t\t\tdataType : \"json\",\r\n");
      out.write("\r\n");
      out.write("\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\talert(data);\r\n");
      out.write("\t\t\t\talert(data.action);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
