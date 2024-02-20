package sec01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("first요청됨" + request);
		//response.sendRedirect("http://localhost:8090/project08/second");
		
		//다른 창으로 넘어가기(?)
		//1.redirect 방법
		response.sendRedirect("second?name=hong");

		
		//2.refresh 방법
//		response.addHeader("Refresh", "1;url=second");
//		Collection<String> coll=response.getHeaderNames();
//		System.out.println(coll);
		
		//3.자바스크립트의 location객체
//		PrintWriter pw = response.getWriter();
//		pw.write("<script>\r\n"
//				+ "location.href=\'second';\r\n"
//				+ "</script>");
				
	}

}
