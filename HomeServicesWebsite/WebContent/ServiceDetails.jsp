<%@page import="dao.WorkDaoImp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Work"%>
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
      <li><a href="AddService.jsp">Update Services</a>
    </ul>
  </div>
</nav>
</br>
<h2><center>List Of Available Service Details</center></h2><a></a>
</br>
</br>
<% 
List<Work> WorkList = new ArrayList<Work>();
WorkList = new WorkDaoImp().getAllWork();
%>
<table class="table">
<tr><td><center><b>Work ID</b></center></td><td><center><b>Service Name</b></center></td><td><center><b>Service Details</b></center></td><td><center><b>Price</b></center></td><td><center><b>Available Timings</b></center></td></tr>
	<% for( Work temp: WorkList) { %>
	<tr> <td><center><%=temp.getWorkId()%> </center></td></td><td><center><a href="WorkerAllocation.jsp?serviceName=<%=temp.getServiceName()%>"><%=temp.getServiceName()%></center></td><td><center><%=temp.getServiceDetails()%> </center></td><td><center><%=temp.getPrice()%> </center></td><td><center><%=temp.getAvailabelTimings()%> </center></td>
	</tr>
	<%} %>
</table>
</body>
</html>