package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public final class filmsInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("td {\r\n");
      out.write("\tborder: 2px solid blue;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<h2>这里显示电影信息</h2>\r\n");
      out.write("\t\t<h2><a href=\"");
      out.print(request.getContextPath() );
      out.write("/AddFilmServlet\">添加电影信息</a></h2>\r\n");
      out.write("\t\t<table style=\"\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>film_id</td>\r\n");
      out.write("\t\t\t\t<td>title</td>\r\n");
      out.write("\t\t\t\t<td>desctiption</td>\r\n");
      out.write("\t\t\t\t<td>language</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				List<String> list = new ArrayList<String>();
				list = (ArrayList) request.getAttribute("list");
				for (int i = 0; i < list.size(); i += 4) {
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(list.get(i));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(list.get(i + 1));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(list.get(i + 2));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(list.get(i + 3));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"");
      out.print(request.getContextPath() );
      out.write("/UpdateFilmServlet?film_id=");
      out.print(list.get(i));
      out.write("\">编辑</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"");
      out.print(request.getContextPath() );
      out.write("/DeleteFilmServlet?film_id=");
      out.print(list.get(i));
      out.write("\">删除</a></td>\r\n");
      out.write("\t\t\t<tr />\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</center>\r\n");
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
