package br.com.alura.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/Hello")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			
		PrintWriter out = resp.getWriter(); //devolve um objeto html
		
		out.println("<html>");
		out.println("<body>");
		out.println("oi mundo, parabens voce escreveu o primeiro servlet.");
		out.println("</body>");
		out.println("</html>");
		}

}
