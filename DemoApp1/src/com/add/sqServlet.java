package com.add;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class sqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws IOException {
		
		//HttpSession  session= req.getSession();
		//int k= Integer.parseInt(req.getParameter("k"));
		//int k= (int) session.getAttribute("k");
		int k=0;
		Cookie cookies[]=req.getCookies();
		
		for(Cookie c: cookies) {
			if(c.getName().equals("k")) {
				k= Integer.parseInt(c.getValue());
			}
		}
		
		k= k*k;
		
		rep.getWriter().println("result="+k);
	}

}
