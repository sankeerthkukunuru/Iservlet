package com.add;

import java.io.IOException;

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
		// rep.getWriter().println("result="+k);
		HttpSession session = req.getSession();
		session.setAttribute("k", k);
	//	rep.sendRedirect("sq?k="+k);  //url rewriting
	}
 


}
