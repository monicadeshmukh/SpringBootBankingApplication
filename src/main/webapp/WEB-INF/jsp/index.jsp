<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html lang="en">
<head>
  <title>Neighborhood Bank</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <c:url value="/img/image5.jpg" var="image5Url" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
   <link rel="stylesheet" href="/css/homeStyles.css">
   <!-- <link rel="stylesheet" type="text/css"
    	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" /> -->



  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container width100 mainContainer" style="width: 100%; margin: 0px; padding: 0px;">
<nav class="navbar navbar-inverse width100">
    <div class="container-fluid">
      <div class="navbar-header ">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand logo ml-auto" id = "logo" style="display: inline;" >NEIGHBORHOOD BANK</a>
      </div>

      <div class="collapse navbar-collapse width100" id="myNavbar">
        <div style="float: right;">
          <ul class="nav navbar-nav">
              <li class="active activeMenu"><a href="/index/">Home</a></li>
              <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Online Account <span class="caret"></span></a>
                  <ul class="dropdown-menu">
                    <li><a href="snacks.html#BatataWada">Enroll </a></li>
                    <li><a href="snacks.html#MeduWada">View Account</a></li>
                    <li><a href="snacks.html#Poha">Bill Pay</a></li>
                  </ul>
                </li>
              <li><a href="/about/">About</a></li>
              <li><a href="/loginRegister/">LogIn</a></li>
              <li><a href="/contact/">Contact</a></li>
            </ul>
      </div>
      </div>
    </div>
</nav>

  <!--<div id = "data" class = "col-12 jumbotron bg-cover text-center" style="text-align: center; display: flex; flex-direction: column; flex-wrap: wrap; background-color: rgba(245, 122, 122, 0.993);  background-size: cover; height:100%; background-repeat: no-repeat;">-->
    <div id = "data" class = "col-12 jumbotron bg-cover width100" style="background-image: url('/img/image5.jpg');">
      <div class="container" style="height: 80%; width:40%; margin: auto; border-radius: 0px;">
        <h2>ONLINE <br> BANKING</h1>
        <h2><small style="color: white;">Convenience of banking at your fingertips.</small></h2><br>
        <h4>Register for online banking.</h4>
        <h4>View your account details.</h4>
        <h4>Make bill payments to registered payees.</h4>
        <a href="/loginRegister/" class="btn btn-primary btn-lg" style="position: absolute;">Get Started</a>
      </div>

  </div>











<!--<footer><iframe src="footer.html" id = "footerFrame"></iframe></footer> container-fluid bg-4 position: absolute; bottom:0; margin:0; -->
<footer class="footer mt-auto px-3 text-center" style="position: absolute; width:100%; bottom:0; background-color: #3D3D3D; color: white; text-align: center">
  2020 <u> Monica Deshmukh's Web Dev. </u> © All rights reserved.</a>
</footer>
<!--<footer style="background-color: #3D3D3D; color: white; text-align: center"> 2019 <u> Monica's Web Dev. </u> All rights reserved.</footer>-->
</body>
</html>
