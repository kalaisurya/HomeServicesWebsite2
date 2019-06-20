package controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RequestDaoImp;
import model.Request;
import model.DB;


/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/RequestController")
public class RequestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestController() {
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
        
		String address =request.getParameter("address");
        
        String timing = request.getParameter("timing");
        int customer_id= Integer.parseInt(request.getParameter("cust_id"));
        int service_id= Integer.parseInt(request.getParameter("service_id"));
        
        Request req = new Request("Not_alloted",address,customer_id,service_id,"Pending",timing);
        
         RequestDaoImp req_dao= new RequestDaoImp();
        
          req_dao.addRequest(req);
        
        
          // display all request by current user
          
         
  
  response.sendRedirect("ViewRequests.jsp?id="+customer_id);

}



	

}


