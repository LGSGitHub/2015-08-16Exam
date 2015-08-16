package com.hand.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.dao.impl.CustomerDaoImpl;
import com.hand.util.ConnectionFactory;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("customerName");
		
		String returnUri = request.getParameter("return_uri");
		
		System.out.println("客户名===》" + name);
		
		RequestDispatcher rd = null;
		
		Connection conn = ConnectionFactory.getInstance().makeConnection();
		
		CustomerDaoImpl cdi = new CustomerDaoImpl();
		if(name == null)
		{
			request.setAttribute("msg", "客户名为空！！！");
			rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		else{
			
			if(cdi.isExist(conn, name))
			{
				//表明当前用户处于登录状态
				request.getSession().setAttribute("flag", "login_success");
				if(returnUri != null)
				{
					rd = request.getRequestDispatcher(returnUri);
					rd.forward(request, response);
				}
				else{
					rd = request.getRequestDispatcher("index.jsp");
					rd.forward(request, response);
				}
			}
			else{
				request.getSession().setAttribute("flag", "login_error");
				request.setAttribute("msg", "用户名输入错误");
				rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
				
			}
		}
	}

}
