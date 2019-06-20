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
      <script language = "Javascript">

function onSubmit() {
alert("Details are entered successfully !!!");
}
</script>
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
      <li class="active"><a href="ServiceDetails.jsp">Home</a></li>
      <li><a href="AdminLogin.jsp">LogOut</a></li>
    </ul>
  </div>
</nav>
<form  name = "frm"method="post" action="AddServiceController" onSubmit="return onSubmit()">
<table class="table">
<tr><td><center>
<br/> Enter Service Name:<font color="black"> <input type="text" name="tf1" /></font>
</center></td>
<tr><td><center><br/>Enter Service Details: <font color="black"><input type="text" name="tf2" /></font></center></td>
</tr>
<tr><td><center><br/> Enter Price: <font color="black"><input type="number" name="tf3" /></font></center></td></tr>
<tr><td><center><br/> Enter Timing: <font color="black"><input type="text" name="tf4" /></font></center></td></tr>
<tr><td><center><br/> <input  type="submit" value="ADD SERVICE" class="btn btn-info" /></center></td>
</tr>
</table>
</form>

<br/>
<hr/>

<h3>List of all Available Services :</h3>

<% 

List<Work> WorkList = new ArrayList<Work>();
WorkList = new WorkDaoImp().getAllWork();

%>

<table class="table">
<tr><td><b>Service Name</b></td><td><b>Service Details</b></td><td><b>Price</b></td><td><b>Available Timings</b></td><td><b>Edit</b></td><td><b>Delete</b></td></tr>
	<% for( Work temp: WorkList) { %>
	<tr><td> <%=temp.getServiceName() %> </td><td><%=temp.getServiceDetails() %> </td><td> <%=temp.getPrice() %> </td><td> <%=temp.getAvailabelTimings() %> </td> <td><a href="EditService.jsp?id=<%=temp.getWorkId()%>"   class="btn btn-info" ><span class="glyphicon glyphicon-edit"></span> EDIT</a></td><td><a href="DeleteServiceController?q1=<%=temp.getWorkId()%>" class="btn btn-danger"> <span class="glyphicon glyphicon-trash"></span> DELETE</a></td> </tr>
	
	<%} %>
</table>

</body>
</html>