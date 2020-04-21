package com.add;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Addservlet extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse rep) throws IOException {
	 logicfun lfun= new logicfun();
		
		int i =Integer.parseInt(req.getParameter("fnume"));
		int j =Integer.parseInt(req.getParameter("snum"));
		
		int k=lfun.add(i,j);
		
		
		
		Cookie cookie = new Cookie("k", k+"");
		rep.addCookie(cookie); // usin cookies to redirect to another servlet
		rep.sendRedirect("sq");

		
		// rep.getWriter().println("result="+k);
		
		//HttpSession session = req.getSession(); //using  session  for redirecting
	//	session.setAttribute("k", k);
		
	//	rep.sendRedirect("sq?k="+k);  //url rewriting
		
	//	rep.sendRedirect("sq");
	}
 


}
