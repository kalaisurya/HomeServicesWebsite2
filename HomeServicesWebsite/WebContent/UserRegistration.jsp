<%@page import="dao.AdminDaoImp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Admin"%>
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

function emailcheck(str) {

var at="@"
var dot="."
var lat=str.indexOf(at)
var lstr=str.length
var ldot=str.indexOf(dot)
if (str.indexOf(at)==-1){
alert("Invalid E-mail ID")
return false
}

if (str.indexOf(at)==-1 || str.indexOf(at)==0 || str.indexOf(at)==lstr){
alert("Invalid E-mail ID")
return false
}

if (str.indexOf(dot)==-1 || str.indexOf(dot)==0 || str.indexOf(dot)==lstr){
alert("Invalid E-mail ID")
return false
}

if (str.indexOf(at,(lat+1))!=-1){
alert("Invalid E-mail ID")
return false
}

if (str.substring(lat-1,lat)==dot || str.substring(lat+1,lat+2)==dot){
alert("Invalid E-mail ID")
return false
}

if (str.indexOf(dot,(lat+2))==-1){
alert("Invalid E-mail ID")
return false
}

if (str.indexOf(" ")!=-1){
alert("Invalid E-mail ID")
return false
}
alert("Details are entered successfully !!!");
return true 
}

function ValidateEmail(){
var emailID=document.frm.txtEmail

if ((emailID.value==null)||(emailID.value=="")){
alert("Please Enter your Email Address")
emailID.focus()
return false
}
if (emailcheck(emailID.value)==false){
emailID.value=""
emailID.focus()
return false
}
return true
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
      <li class="active"><a href="WorkDetails.jsp">Home</a></li>
      <li><a href="AdminLogin.jsp">LogOut</a></li>
    </ul>
  </div>
</nav>
<center><table class="table">
<form  name = "frm"method="post" action="AddUserController" onSubmit="return ValidateEmail()">
</br>
<center><h2>User Registration</h2></center>
</br>
</br>
<tr>
<td><br/><center>FirstName: <font color="red">*</font><font color="black"><input type="text" name="tf1"required  /></font></center></td>
</tr>
<tr>
<td><br/><center>LastName: <font color="red">*</font><font color="balck"><input type="text" name="tf2"required  /></font></center></td>
</tr>
<tr>
<td><br/><center>Email: <font color="red">*</font><font color="black"><input type="text" name="txtEmail"required  /></font></center></td>
</tr>
<tr>
<td><br/><center>ConatactNumber: <font color="red">*</font><font color="balck"><input type="text" name="tf4"required  /></font></center></td>
</tr>
<tr>
<td><br/><center>Password: <font color="red">*</font><font color="balck"><input type="password" name="tf5"required  /></font></center></td>
</tr>
<tr>
<td> <br/><center>Skills:<font color="red">*</font>
<font color="black"><select name="tf6"required />
<option value="HANDYMAN">Handy Man</option>
<option value="VACATION AND EXTENDED TRAVEL">Vacation and External Travel</option>
<option value="APPLIANCES">Appliances</option>
<option value="CABINETRY">Cabinetry</option>
<option value="CARPET">Carpet</option>
<option value="CHIMNEY">Chimney</option>
<option value="DRIVEWAYS">Driveways</option>
<option value="DUCT CLEANING">Duct Cleaning</option>
<option value="ELECTRICAL">Electrical</option>
<option value="FURNITURE">Furniture</option>
<option value="GLASS AND SCREENS">Glass and Screens</option>
<option value="GUTTERS">Gutters</option>
<option value="HVAC">Hvac</option>
<option value="HARDWOOD FLOORING">Hardwood Flooring</option>
<option value="LIGHTING">Lighting</option>
<option value="MASONRY">Masonry</option>
<option value="PAINTING">Painting</option>
<option value="PEST CONTROL">Pest Control</option>
<option value="PLUMBING">Plumbing</option>
<option value="POOLS">Pools</option>
<option value="REFUSE REMOVAL">Refuse Removal</option>
<option value="SURFACES">Surfaces</option>
<option value="WINDOWS AND DOORS">Windows and Doors</option></font>
</select>
</center>
</td>
</tr>
<tr>
<td><br/><center><input  type="submit" value="ADD USER"class="btn btn-info" /></center></td>
</tr>
</form>
</table>
</center>
</body>
<br/>
<hr/>
