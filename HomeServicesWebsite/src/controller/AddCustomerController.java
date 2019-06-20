package controller;





import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDao;
import dao.CustomerDaoImp;
import model.Customer;

/**
 * Servlet implementation class AddFlowerController
 */
@WebServlet("/AddCustomerController")
public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomerController() {
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
		Customer admin = new Customer(fm,lm,em,cn,pw);
		CustomerDaoImp dao = new CustomerDaoImp();
		dao.addCustomer(admin);
		
		response.sendRedirect("success.jsp");
		
	}

}





