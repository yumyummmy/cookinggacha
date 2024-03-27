package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dbcontroller
 */
@WebServlet("/DbController")
public class DbController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		if(){
//	}
		System.out.println("データベースに正常に追加されました");
		request.getRequestDispatcher("WEB-INF/jsp/SuccessInsert.jsp").forward(request, response);
	}

}
