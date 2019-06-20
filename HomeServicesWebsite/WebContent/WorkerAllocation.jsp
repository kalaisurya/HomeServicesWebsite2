<%@page import="dao.UserDaoImp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
    
<style>
body {
height:100%;
   width:100%;
   background-image:url(two.jpg);/*your background image*/  
   background-repeat:no-repeat;/*we want to have one single image not a repeated one*/  
   background-size:cover;/*this sets the image to fullscreen covering the whole screen*/  
   /*css hack for ie*/     
   filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='.two.jpg',sizingMethod='scale');
   -ms-filter:"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='two-.jpg',sizingMethod='scale')";
  color: white;
}

h1 {
  color: white;
}
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Home Service Website  </a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="AdminOperations.jsp">Home</a></li>
      <li><a href="AdminLogin.jsp">LogOut</a></li>
    </ul>
  </div>
</nav>

<%
    

	String serviceName =  request.getParameter("serviceName").toString();


    List<User> userList = new ArrayList<User>();
    userList = new UserDaoImp().getUser(serviceName);
    
    request.getSession().setAttribute("serviceName", serviceName);

    String message = (String)  request.getSession().getAttribute("message");

%>
</br>
<h3><center>Welcome to Edit Service</center></h3>
</br>
</br>
  <script language = "Javascript">
<%
 if (message!=null){
%>


alert("<%=message%>");


<%
request.getSession().setAttribute("message",null);
 }
%>
</Script>

<form action="AdminController" method="post">
<table class="table"> 
<tr><td><center><b>Worker ID</b></center></td><td><center><b>First Name</b></center></td><td><center><b>Last Name</b></center></td><td><center><b>Contact Number</b></center></td><td><center><b>Email Id</b></center></td><td><center><b>Select Worker</b></center></td></tr>
	
<% for( User temp: userList) { %>
      <tr><td><center><%=temp.getUserId()%> </center> </td> <td><center><%=temp.getFirstName()%> </center></td></td><td><center><%=temp.getLastName()%> </center></td>
      <td><center><%=temp.getContactNumber()%> </center></td><td><center><%=temp.getEmail()%> </center></td>
     <td><center><input type="checkbox" name="workerids" value="<%=temp.getUserId()%>" > <%=temp.getUserId()%></center></td></td>
      </tr>
      <%} %>
      </table>
      <center><input type="Submit" value="Allocate"></center>
      
</form>

<br/>
<hr/>


</body>
</html>
