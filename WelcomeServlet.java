package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */ 
public class WelcomeServlet extends GenericServlet
{
   public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
         
	   PrintWriter out=response.getWriter();
	   out.println("Welcome to Servlet Programming");
	   out.close();
			
	}

}
