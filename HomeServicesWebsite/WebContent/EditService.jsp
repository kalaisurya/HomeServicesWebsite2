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
      <li class="active"><a href="AddService.jsp">Home</a></li>
      <li><a href="AdminLogin.jsp">LogOut</a></li>
    </ul>
  </div>
</nav>

<%
	int id = Integer.parseInt( request.getParameter("id") );
	Work work = new Work();
	work = new WorkDaoImp().getWorkById(id);
	

%>
</br>
<h3><center>Welcome to Edit Service</center></h3>
</br>
</br>
<form action="EditWorkController" method="post">
<table class="table">
<tr><td>
<br/><center>Enter Service ID: <font color="black"><input type="text" name="tf1" value="<%=id %>"  readonly="readonly"/></font></center></td></tr>
<tr><td><br/><center>Enter Service Name: <font color="black"><input type="text" name="tf2" value="<%=work.getServiceName() %>"/></font></center></td></tr>
<tr><td><br/><center>Enter Service Details :<font color="black"><input type="text" name="tf3" value="<%=work.getServiceDetails() %>" /></font></center></td></tr>
<tr><td><br/><center>Enter Price :<font color="black"><input type="number" name="tf4" value="<%=work.getPrice() %>" /></font></center></td></tr>
<tr><td><br/><center>Enter Timing :<font color="black"> <input type="text" name="tf5" value="<%=work.getAvailabelTimings() %>" /></font></center></td></tr>
<tr><td><br/><center><input  type="submit" value="EDIT SERVICE" class="btn btn-info" /></center></td></tr>
</table>
</form>

<br/>
<hr/>


</body>
</html>>