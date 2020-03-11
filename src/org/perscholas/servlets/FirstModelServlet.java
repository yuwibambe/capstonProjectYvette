package org.perscholas.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.perscholas.JPA.Entities.Member;
import org.perscholas.JPA.Services.MService;




/**
 * Servlet implementation class FirstModelServlet
 */
@WebServlet("/FirstModelServlet")
public class FirstModelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user= request.getParameter("username");
		String pass = request.getParameter("password");
		request.setAttribute("username", user);
		request.setAttribute("loggedIn", false);
		
		MService ms = new MService();	
		List<Member> member =ms.getAll();
		request.setAttribute("memberList", member);
		
		for( Member mem : member) {
			if( mem.getAccountName().equals(user)
					&& mem.getPassword().equals(pass)) {
				HttpSession session = request.getSession();
				session.setAttribute("id", mem.getMemberId());
				session.setAttribute("firstname",mem.getFirstName());
				session.setAttribute("lastname",mem.getLastName());
				
				
				request.setAttribute("loggedIn", true);
				break;
			}
		}
		
//		request.setAttribute("List", member);
		ms.closing();
		ms=null;
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}
}
