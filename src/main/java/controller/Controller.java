package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.GatyaUser;
import dao.Dao;



@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("サーブレット実行中");
//		List<GatyaUser> list = new ArrayList<>();
//		list = Dao.selectryouri();
//		System.out.println(list.get(0));

//		request.setAttribute("list", list);
		
		HttpSession session =request.getSession();
		List<GatyaUser> user = (List<GatyaUser>) session.getAttribute("userList");
		user = Dao.selectryouri();
		session.setAttribute("user",user);
//		System.out.println(user.get(3));
		
		System.out.println("e");
		request.getRequestDispatcher("/WEB-INF/jsp/gatya.jsp").forward(request, response);
		System.out.println("f");
	}

	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//	}

}
