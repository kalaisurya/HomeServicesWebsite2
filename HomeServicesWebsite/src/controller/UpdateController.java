package controller;




import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.WorkAssignedDaoImp;
import model.DB;
import model.WorkAssigned;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
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
		String sm=request.getParameter("tf1");
		String lo=request.getParameter("tf2");
		String tm=request.getParameter("tf3");
		String at=request.getParameter("tf4");
		String st=request.getParameter("tf5");
		WorkAssigned work = new WorkAssigned(sm,lo,tm,at);
		WorkAssignedDaoImp dao = new WorkAssignedDaoImp();
		dao.addWork(work);
		doGet(request, response);
       // String m=request.getParameter("tf4");
        
        try {
			Connection con = DB.getConnection();
			String sql = "update userdetails set Status=? where First_Name=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,st);
			ps.setString(2,at);
			int rowaffected = 	ps.executeUpdate();
			System.out.println(rowaffected + " rows updated ");
			response.sendRedirect("WorkDetails.jsp");
			con.close();
			 }catch(Exception e){
				 System.out.println("Error : " + e);
			 }
}



	

}

