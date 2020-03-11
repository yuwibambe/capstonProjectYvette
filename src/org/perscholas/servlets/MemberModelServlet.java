package org.perscholas.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.perscholas.JPA.Entities.Member;
import org.perscholas.JPA.Services.MService;



/**
 * Servlet implementation class MemberModelServlet
 */
@WebServlet("/MemberModelServlet")
public class MemberModelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberModelServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String pass = request.getParameter("password");
		String user = request.getParameter("username");
		request.setAttribute("Exists", false);

		Member member = new Member(fname, lname, user, pass);
		MService ms = new MService();

		List<Member> member1 = ms.getAll();
		request.setAttribute("MemberList", member1);

		for (Member m1 : member1) {
			if (m1 != null) {
				if (m1.getAccountName().equals(user)) {
					request.setAttribute("Exists", true);
					break;
				}
				else {
					request.setAttribute("Exists", false);
					break;
				}
				
			} 
		}
		if (!(boolean) request.getAttribute("Exists")) {

			ms.add(member);
			request.setAttribute("welcome", "Account created successfully.Please sign in !!");
		}
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
