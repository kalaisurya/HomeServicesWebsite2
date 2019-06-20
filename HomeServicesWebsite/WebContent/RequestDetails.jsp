<%@page import="dao.RequestDaoImp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Request"%>
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
      <li><a href=AdminLogin.jsp>LogOut</a></li>
    </ul>
  </div>
</nav>
</br>
<h3><center>Requests Posted</center></h3>

</br>
</br>
<% 
List<Request> RequestList = new ArrayList<Request>();
RequestList = new RequestDaoImp().getAllRequest();
%>

<table class="table">
<tr><td><center><b>Request_Id</b></center></td><td><center><b>Service_Id</b></center></td><td><center><b>Worker Alloted</b></center></td><td><center><b>Time</b></center></td><td><center><b>Address</b></center></td><td><center><b>Status</b></center></td></tr>
	<% for( Request temp: RequestList) { %>
	<tr> <td><center><%=temp.getRequest_Id() %> </center></td> <td><center><%=temp.getService_Id() %> <td><center><%=temp.getWorker_Alloted()%> </center></td> <td><center><%=temp.getWorker_time()%> </center></td> <td><center><%=temp.getAddress() %> </center></td><td><center><%=temp.getStatus() %> </center></td> </center></td> </tr>
	
	<%} %>
</table>
</body>
</html>