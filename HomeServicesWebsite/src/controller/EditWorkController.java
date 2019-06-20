package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.WorkDaoImp;
import model.Work;

/**
 * Servlet implementation class EditFlowerController
 */
@WebServlet("/EditWorkController")
public class EditWorkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditWorkController() {
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
	//	doGet(request, response);
		int id =Integer.parseInt( request.getParameter("tf1") );
		String sn = request.getParameter("tf2");
		String sd = request.getParameter("tf3");
		int price =Integer.parseInt( request.getParameter("tf4") );
		String time = request.getParameter("tf5");
		Work work = new Work(sn, sd, price, time,id);
		WorkDaoImp dao = new WorkDaoImp();
		dao.updateWork(work);
		response.sendRedirect("AddService.jsp");
	}

}
