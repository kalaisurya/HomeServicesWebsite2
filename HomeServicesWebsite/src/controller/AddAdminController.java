package controller;



	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import dao.AdminDao;
	import dao.AdminDaoImp;
import model.Admin;

	/**
	 * Servlet implementation class AddFlowerController
	 */
	@WebServlet("/AddAdminController")
	public class AddAdminController extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public AddAdminController() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
				String fm=request.getParameter("tf1");
				String lm=request.getParameter("tf2");
				String em=request.getParameter("tf3");
				String cn=request.getParameter("tf4");
				String pw=request.getParameter("tf5");
			Admin admin = new Admin(fm,lm,em,cn,pw);
			AdminDaoImp dao = new AdminDaoImp();
			dao.addAdmin(admin);
			
			response.sendRedirect("AdminLogin.jsp");
			
		}

	}

	
	
	
