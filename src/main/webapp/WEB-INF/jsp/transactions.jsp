<!DOCTYPE html>
<html lang="en">
<head>
  <title>Neighborhood Bank</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="/css/loginRegisterStyles.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>
<!--<%@ page errorPage="error.jsp" %>-->
<div class="container" style="width: 100%; margin: 0px; padding: 0px;">
<nav class="navbar navbar-inverse ">
    <div class="container-fluid">
      <div class="navbar-header ">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand logo ml-auto" id = "logo" style="display: inline;" >NEIGHBORHOOD BANK</a>
      </div>

      <div class="collapse navbar-collapse " id="myNavbar">
        <div style="float: right;">
          <ul class="nav navbar-nav">
              <li><a href="/index/">Home</a></li>
              <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="snacks.html">Online Account <span class="caret"></span></a>
                  <ul class="dropdown-menu">
                    <li><a href="snacks.html#BatataWada">Enroll </a></li>
                    <li><a href="snacks.html#MeduWada">View Account</a></li>
                    <li><a href="snacks.html#Poha">Bill Pay</a></li>
                  </ul>
                </li>
              <li><a href="/about/">About</a></li>
              <li class="active activeMenu"><a href="/loginRegister/">LogIn</a></li>
              <li><a href="/contact/">Contact</a></li>
            </ul>
      </div>
      </div>
    </div>
</nav>

  <!--<div id = "data" class = "col-12 jumbotron bg-cover text-center" style="text-align: center; display: flex; flex-direction: column; flex-wrap: wrap; background-color: rgba(245, 122, 122, 0.993);  background-size: cover; height:100%; background-repeat: no-repeat;">-->
    <div id = "data" class = "row jumbotron bg-cover width100" style="background-color: blue;">
        <div class = "col-9 col-sm-12">
          <div class="container">
            <div class="main"   style="position: absolute;">
             <h2 id="signInLabel">Transactions </h2><br>
             <!-- <table class="table table-bordered">
                <thead>
                  <tr>
                    <th>Transaction Date</th>
                    <th>Description</th>
                    <th>Deposit / Credit</th>
                    <th>Withdrawal / Debit</th>
                    <th>Transacting account number</th>
                    <th>Transacting account Name</th>
                  </tr>
                </thead>

                <tbody>
                  <c:forEach var="transactions" items="${transaction}">
                    <tr>
                      <td>${transactions.transactionDate}</td>
                      <td>${transactions.description}</td>
                      <td>${transactions.deposit}</td>
                      <td>${transactions.withdrawal}</td>
                      <td>${transactions.customerAccount}</td>
                      <td>${transactions.customerAccount}</td>
                    </tr>
                  </c:forEach>
                </tbody>
                
              </table>-->
            </div>
          </div>
        </div>



    </div>











<!--<footer><iframe src="footer.html" id = "footerFrame"></iframe></footer> container-fluid bg-4 position: absolute; bottom:0; margin:0; -->
<footer class="footer mt-auto px-3 text-center" style="position: absolute; width:100%; bottom:0; background-color: #3D3D3D; color: white; text-align: center">
  2020 <u> Monica Deshmukh Web Dev. </u> © All rights reserved.</a>
</footer>
</div>
<!--<script type="text/javascript" src="./js/login.js"></script>-->
</body>
</html>
