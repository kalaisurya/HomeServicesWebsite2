<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
body{
   height:100%;
   width:100%;
   background-image:url(lighting.jpg);/*your background image*/  
   background-repeat:no-repeat;/*we want to have one single image not a repeated one*/  
   background-size:cover;/*this sets the image to fullscreen covering the whole screen*/  
   /*css hack for ie*/     
   filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='.lighting.jpg',sizingMethod='scale');
   -ms-filter:"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='lighting-.jpg',sizingMethod='scale')";
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
	  
    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */
    .row.content {height: 780px;
          }
    
    /* Set gray background color and 100% height */
    .sidenav {
      
       color: white;
      height: 50%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
       
        height: 100%;
        padding: 15px;
      }
      .row.content {height: auto;} 
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
      <li><a href=Home.jsp>LogOut</a></li>
    </ul>
  </div>
</nav>
<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav">
      <ul class="nav nav-pills nav-stacked">
        
           <li><a href="AdminLogin.jsp"><font color="white">Admin </font></a></li>
           <li><a href="CustomerLogin.jsp"><font color="white">Customer </font></a></li>
      </ul><br>
      </body>
    </div>
 
<div class="col-sm-9">
      <h1><center><p class="b"><font size="50" color="white"> Home Service Website</font></p></center></h1>
      </br>
      </br>
       </br>
        </br>
         </br>
          </br>
           </br>
            </br>
            </br>
            </br>
      <h2><center><p class="b"><font size="50" color="white"> We Wish To Maintain Your</font></center></h2>
      <h2><center><p class="b"><font size="50" color="white"> Beautiful <p class="b"><font size="50" color="white"> HOME.!</font></center></h2>
    </div>
  </div>
</div>
</br>

<footer class="container-fluid">
 <h4>Contact Us:8870836483</h4>
</footer>
</body>
</html>
