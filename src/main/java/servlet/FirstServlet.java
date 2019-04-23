//package servlet;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import model.Client;
//import model.User;
//
///**
// * Servlet implementation class FirstServlet
// */
//@WebServlet("/hello")
//public class FirstServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * Default constructor.
//	 */
//	public FirstServlet() {
//		// TODO Auto-generated constructor stub
//	}
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String login = request.getParameter("Identifiant");
//		String pwd = request.getParameter("MotdePasse");
//		User u = new User(login, pwd);
//
//		String nomUtilisateur = u.getLogin();
//		String motDePasse = u.getPassword();
//
//		// request.setAttribute("Utilisateur", u);
//
//		RequestDispatcher requestDispatcher;
//		if ((nomUtilisateur.equalsIgnoreCase(login)) && (motDePasse.equalsIgnoreCase(pwd))) {
//			requestDispatcher = request.getRequestDispatcher("Accueil.html");
//		} else {
//			requestDispatcher = request.getRequestDispatcher("aa.html");
//		}
//		requestDispatcher.forward(request, response);
//
//	}
//
//}
