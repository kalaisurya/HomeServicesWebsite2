package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.WorkDao;
import dao.WorkDaoImp;
import model.Work;

/**
 * Servlet implementation class AddFlowerController
 */
@WebServlet("/AddServiceController")
public class AddServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServiceController() {
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
			
		String sn = request.getParameter("tf1");
		String sd = request.getParameter("tf2");
		int price =Integer.parseInt( request.getParameter("tf3") );
		String time = request.getParameter("tf4");
		System.out.println("welcome-----"+sn);
		Work work = new Work(sn,sd,price,time);
		WorkDaoImp dao = new WorkDaoImp();
		dao.addWork(work);
		response.sendRedirect("AddService.jsp");
		
	}

}
