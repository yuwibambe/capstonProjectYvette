package org.perscholas.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.perscholas.JPA.Entities.Goal;
import org.perscholas.JPA.Entities.Member;
import org.perscholas.JPA.Services.GoalService;

/**
 * Servlet implementation class GoalModelServlet
 */
@WebServlet("/GoalModelServlet")
public class GoalModelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GoalModelServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String weightNum = request.getParameter("weightNum");
		String calorieNum = request.getParameter("calorieNum");
		String workoutDesc = request.getParameter("workoutDesc");
		String goal = request.getParameter("goal");
//(double weight, int caloriNum, String workoutDesc, String goalDesc, Member member)
		Goal goal1 = new Goal(Double.valueOf(weightNum), Integer.valueOf(calorieNum), workoutDesc, goal, null);
		GoalService gs = new GoalService();
		gs.addGoal(goal1);
		List<Goal> goals = gs.getAllgoals();
		request.setAttribute("GoalList", goals);

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/goal.jsp");
		rd.forward(request, response);
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
