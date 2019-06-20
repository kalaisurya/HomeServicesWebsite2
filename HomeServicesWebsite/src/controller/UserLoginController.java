package controller;




import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminLoginDao;
import dao.AdminLoginDaoImp;
import dao.UserLoginDao;
import dao.UserLoginDaoImp;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginController")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginController() {
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
		doGet(request, response);
        String m=request.getParameter("txtEmail");
        String m1=request.getParameter("tf2");
        UserLoginDao dao = new UserLoginDaoImp();
        String pass = dao.getpasswordbyloginId(m);
        System.out.println(m+" "+m1);
        if(pass.equals(m1))
        {
          response.sendRedirect("RequestDetails.jsp");
      
        }else
        response.sendRedirect("UserLogin.jsp");
}


	

}

