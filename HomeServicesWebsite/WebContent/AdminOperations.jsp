<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
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
      div.b {font-family: verdana;}
      p.b{
  font-family: "Times New Roman", Times, serif;
}
	  p.b {
	  font-style: italic;
	  
	}
	 p.a {
	  font-style: bold;
	  
	}
	</style>
</head>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Home Service Website  </a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Home.jsp">Home</a></li>
      <li><a href=AdminLogin.jsp>LogOut</a></li>
    </ul>
  </div>
</nav>
<body>
<center><table class="table">
<tr><td><h1><center><p class="b"><b>WELCOME</b></p></center></h1></td></tr>
<tr><td><h3><center><p class="b"><b>For Workers</b><a href="WorkDetails.jsp">click here</a></p></center></h3></td></tr>
<tr><td><h3><center><p class="b"><b>For Services</b><a href="ServiceDetails.jsp">click here</a></p></center></h3></td></tr>
<tr><td><h3><center><p class="b"><b>For Request</b><a href="RequestDetails.jsp">click here</a></p></center></h3></td></tr>

</table>
</body>
</html>