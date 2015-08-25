package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;

public final class updateFilm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>更新电影信息</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/DoUpdateServlet\" method=\"post\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t");

					List<String> flist = new ArrayList<String>();
					flist = (ArrayList) request.getAttribute("filmList");
					//for (int i = 0; i < flist.size(); i++) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>film_id</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"film_id\" readonly=\"readonly\" value=\"");
      out.print( request.getAttribute("film_id"));
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>title</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"title\" value=\"");
      out.print(flist.get(0));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>description</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"description\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(flist.get(1));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					//}
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>language</td>\r\n");
      out.write("\t\t\t\t\t<td><select name=\"language\">\r\n");
      out.write("\t\t\t\t\t\t\t");

								List<String> llist = new ArrayList<String>();
								llist = (ArrayList) request.getAttribute("languageList");
								for (int i = 0; i < llist.size(); i++) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option>");
      out.print(llist.get(i));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" name=\"submit\" value=\"submit\" /></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"reset\" name=\"reset\" value=\"reset\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
