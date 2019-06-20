<%@page import="dao.UserDaoImp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
      <li class="active"><a href="Home.jsp">Home</a></li>
      <li><a href="Home.jsp">LogOut</a></li>
    </ul>
  </div>
</nav>
<table class="table">
<form action="UpdateController"  method="post";">
<tr>
<td><br/><center>Service Name:<font color="black"><input type="text" name="tf1"  /></font></center></td>
</tr>
<tr>
<td><br/><center>Location:<font color="black"><input type="text" name="tf2" /></font></center></td>
</tr>
<tr>
<td><br/><center>Time:<font color="black"><input type="text" name="tf3" /></font></center></td>
</tr>
<tr>
<td><br/><center>Name:<font color="black"><input type="text" name="tf4" required /></font></center></td>
</tr>
<tr>
<td><br/><center>Status:<font color="black"><input type="text" name="tf5"required  /></font></center></td>
</tr>
<tr>
<td><br/><center><input type="submit" value="Update" class="btn btn-info" /></center></td>
</tr>
</form>
</table>
</body>
</html>