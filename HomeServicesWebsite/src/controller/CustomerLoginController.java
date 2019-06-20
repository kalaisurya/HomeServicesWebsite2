package controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerLoginDao;
import dao.CustomerLoginDaoImp;
import dao.RequestDao;
import dao.RequestDaoImp;

/**
* Servlet implementation class UserLoginServlet
*/
@WebServlet("/CustomerLoginController")
public class CustomerLoginController extends HttpServlet {
                private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerLoginController() {
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
        System.out.println(m+" "+m1);
        CustomerLoginDao dao = new CustomerLoginDaoImp();
        String pass = dao.getpasswordbyloginId(m); 
     
        if(pass.equals(m1))
        {
                  
            RequestDao requestdao = new RequestDaoImp();
            int id = requestdao.getcustromerId(m);
            System.out.println("HAIIIIIIIIIIIIIII");
          response.sendRedirect("CustomerServices.jsp?id="+id);
     
      
        }else
        response.sendRedirect("CustomerLogin.jsp");
}


                

}
