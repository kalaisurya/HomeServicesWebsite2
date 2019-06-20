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
@WebServlet("/AddWorkController")
public class AddWorkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddWorkController() {
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
			String sn=request.getParameter("tf1");
			String sd=request.getParameter("tf2");
			int pr = Integer.parseInt(request.getParameter("tf3"));
			String at=request.getParameter("tf4");
		Work work = new Work(sn,sd,pr,at);
		WorkDaoImp dao = new WorkDaoImp();
		
		
		
		
	}

}


