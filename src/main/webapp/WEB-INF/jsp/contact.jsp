<!DOCTYPE html>
<html lang="en">

<head> <!-- header begins here -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <link href="https://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
     <link rel="stylesheet" href="/css/contactStyles.css">
     <link rel="stylesheet" href="headerStyle.css">
     <link rel="stylesheet" href="footerStyle.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

    <title>Contact</title>

</head> <!-- header ends here -->
<body>
    <div class="container width100 paddingMargin0">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
              <div class="navbar-header">
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
                      <li><a href="/loginRegister/">LogIn</a></li>
                      <li class = "active activeMenu"><a href="/contact/">Contact</a></li>
                    </ul>
              </div>
              </div>
            </div>
        </nav>

        <header class="jumbotron bg-cover">
            <div class="container bg-primary text-center">
                    <div class="col-12 col-sm-6">
                        <h2>How can we help?</h2>
                        <h3></h3>

                    </div>

            </div>
        </header>

        <div class="container bg-light width100 paddingMargin0" style="height:500px;">
            <div class="row width100 paddingMargin0 contactInfo" >
                <ol class="col-12 breadcrumb" style="width: 100%; padding: 5px; margin-left: 5px; margin-right: 5px;">
                    <li class="breadcrumb-item"><a href="/index/">Home</a></li>
                    <li class="breadcrumb-item active">Contact Us</li>
                </ol>

            </div>

            <div class="row row-content d-flex width100 paddingMargin0 contactInfo">
                <div class="col-12 d-flex pl-3">
                    <h3>Location Information</h3>
                </div>
                <div class="col-12 col-sm-4 offset-sm-1 ml-3">
                    <h5>Our Address</h5>
                        <address style="font-size: 100%">
                        Suite 121, Clear Water Ave<br>
                        Blue Skies City, VA 54333<br>
                        <br>

                    </address>
                </div>
                <div class="col-12 col-sm-6 offset-sm-1">
                    <h5>Map of our Location</h5>
                </div>
                <div class="col-12 col-sm-11 offset-sm-1">
                    <button type="button" class="btn btn-primary btn-lg mr-3" href="tel:+7573341815">Call Us</button>
                    <button type="button" class="btn btn-secondary btn-lg" href="mailto:neighborhoodbank@gmail.com">Email Us</button>
                </div>
            </div>

        <!-- <div class="row row-content">
            <div class="col-12" id=>
                <h3>Send us your Feedback</h3>
            </div>
                <div class="col-12 col-md-9">
                    <form>
                        <div class="form-group row">
                            <label for="firstname" class="col-md-2 col-form-label">First Name</label>
                            <div class="col-md-10">
                                <input type="text" class="form-control" id="firstname" name="firstname" placeholder="Please enter First Name">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="lastname" class="col-md-2 col-form-label">Last Name</label>
                            <div class="col-md-10">
                                <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Please enter Last Name">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="telnum" class="col-12 col-md-2 col-form-label">Contact Tel.</label>
                            <div class="col-5 col-md-3">
                                <input type="tel" class="form-control" id="areacode" name="areacode" placeholder="Area code">
                            </div>
                            <div class="col-7 col-md-7">
                                <input type="tel" class="form-control" id="telnum" name="telnum" placeholder="Please enter Tel. number">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="emailid" class="col-md-2 col-form-label">Email</label>
                            <div class="col-md-10">
                                <input type="email" class="form-control" id="emailid" name="emailid" placeholder="Please enter your Email">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-md-5 offset-md-2">
                                <div class="form-check">
                                    <input type="checkbox" class="form-check-input" name="approve" id="approve" value="">
                                    <label class="form-check-label" for="approve">
                                        <strong>Contact me</strong>
                                    </label>
                                </div>
                            </div>
                            <div class="col-md-5">
                                <select class="form-control" id="contactPreference">
                                    <option>phone</option>
                                    <option>Email</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="feedback" class="col-md-2 col-form-label">Your Feedback</label>
                            <div class="col-md-10">
                                <textarea class="form-control" id="feedback" name="feedback" rows="12"></textarea>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="offset-md-2 col-md-10">
                                <button type="submit" class="btn btn-primary">Send Feedback</button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-12 col-md">
                </div>
        </div>-->

        </div>
    </div>
    <footer class="footer" style="width: 100%;">
        <div class="container" style="width: 100%;" >
            <div class="row">
                <div class="col-4 offset-1 col-sm-2">
                    <h5>Links</h5>
                    <ul class="list-unstyled">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="about.html">About</a></li>
                        <li><a href="loginRegister.html">logIn</a></li>
                        <li><a href="contact.html">Contact</a></li>
                    </ul>
                </div>
                <div class="col-7 col-sm-5">
                    <h5>Our Address</h5>
                    <address>
		              121, Clear Water Bay Road<br>
		              Clear Water Bay, Kowloon<br>
		              HONG KONG<br>
                      <i class="fa fa-phone fa-lg"></i>: +852 1234 5678<br>
                      <i class="fa fa-fax fa-lg"></i>: +852 8765 4321<br>
                      <i class="fa fa-envelope fa-lg"></i>:
                      <a href="mailto:confusion@food.net">confusion@food.net</a>
		           </address>
                </div>
                <div class="col-12 col-sm-4 align-self-center">
                    <div class="text-center">
                        <a class="btn btn-social-icon btn-google" href="http://google.com/+"><i class="fa fa-google-plus"></i></a>
                        <a class="btn btn-social-icon btn-facebook" href="http://www.facebook.com/profile.php?id="><i class="fa fa-facebook"></i></a>
                        <a class="btn btn-social-icon btn-linkedin" href="http://www.linkedin.com/in/"><i class="fa fa-linkedin"></i></a>
                        <a class="btn btn-social-icon btn-twitter" href="http://twitter.com/"><i class="fa fa-twitter"></i></a>
                        <a class="btn btn-social-icon btn-google" href="http://youtube.com/"><i class="fa fa-youtube"></i></a>
                        <a class="btn btn-social-icon" href="mailto:"><i class="fa fa-envelope-o"></i></a>
                    </div>
                </div>
           </div>
            <div class="container-fluid row bg-4 text-center" style="width:100%; background-color: #3D3D3D; color: white; text-align: center">
                2020 <u> Monica Deshmukh Web Dev. </u> © All rights reserved.</a>
            </div>
        </div>
    </footer>
    <!-- jQuery first, then Popper.js, then Bootstrap JS. -->
    <script src="node_modules/jquery/dist/jquery.slim.min.js"></script>
    <script src="node_modules/popper.js/dist/umd/popper.min.js"></script>
    <script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
</body>

</html>
