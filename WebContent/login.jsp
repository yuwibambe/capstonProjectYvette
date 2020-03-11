<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700&display=swap"
	rel="stylesheet">

<link
	href="https://fonts.googleapis.com/css?family=EB+Garamond:400,400i,500,500i,600,600i,700,700i&display=swap"
	rel="stylesheet">

<link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">

<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<link rel="stylesheet" href="css/magnific-popup.css">

<link rel="stylesheet" href="css/aos.css">

<link rel="stylesheet" href="css/ionicons.min.css">

<link rel="stylesheet" href="css/bootstrap-datepicker.css">
<link rel="stylesheet" href="css/jquery.timepicker.css">


<link rel="stylesheet" href="css/flaticon.css">
<link rel="stylesheet" href="css/icomoon.css">
<link rel="stylesheet" href="css/style.css">

<title>Insert title here</title>
</head>
<body>
<section class="home-slider js-fullheight owl-carousel">
		<div class="slider-item js-fullheight"
			style="background-image: url(img/3.jpg);">
			<div class="overlay"></div>
			<div class="container">
				<div
					class="row no-gutters slider-text js-fullheight align-items-center justify-content-center"
					data-scrollax-parent="true">
					<div class="col-md-10 text ftco-animate text-center">
						<h1 class="mb-4">Discover Your Inner Sanctuary</h1>
						<h3 class="subheading">@ yu fitness</h3>
					</div>
				</div>
			</div>
		</div>

		<div class="slider-item js-fullheight"
			style="background-image: url(img/bg_2.jpg);">
			<div class="overlay"></div>
			<div class="container">
				<div
					class="row no-gutters slider-text js-fullheight align-items-center justify-content-center"
					data-scrollax-parent="true">
					<div class="col-md-10 text ftco-animate text-center">
						<h1 class="mb-4">Lighting Your Heart &amp; Mind</h1>
					</div>
				</div>
			</div>
		</div>
		<div class="slider-item js-fullheight"
			style="background-image: url(img/2.jpg);">
			<div class="overlay"></div>
			<div class="container">
				<div
					class="row no-gutters slider-text js-fullheight align-items-center justify-content-center"
					data-scrollax-parent="true">
					<div class="col-md-10 text ftco-animate text-center">
						<h1 class="mb-4">Lighting Your Heart &amp; Mind</h1>
					</div>
				</div>
			</div>
		</div>
	</section>
 <div class="container-fluid list content">
          <div class="row">
            <div class="col-md-4 col-sm-4 col-xs-12"></div>
            <div class="col-md-4 col-sm-4 col-xs-12">
              <form class="form-container" action="MyFirstServlet" method="post">
                <h1>
                	
                </h1>
                <h3>Please Sign In</h3>
                  <div class="form-group">
	                  <div class="input-group">
							<span class="input-group-addon"><i class="fa fa-user"></i></span>
	                    	<input type="text" class="form-control" id="username" placeholder="Username" required ="required" name="username">
	                  </div>
	                 </div>
                  <div class="form-group">
	                    <div class="input-group">
							<span class="input-group-addon"><i class="fa fa-lock"></i></span>
                    	<input type="password" class="form-control" id="password"  placeholder="Password" name="password" required="required">
	                  </div>
	                 </div>
                  <div class="form-group">
                  <input type="submit" class="btn btn-primary py-2 px-5" value="Login" name="submit" onclick="login()">
                  <br>
                  <br>
                  <input type="button" class="btn btn-primary" value="Create Account" onclick="location.href='./register.jsp'" >
                  </div>
                </form>
            </div>
            <div class="col-md-4 col-sm-4 col-xs-12"></div>
            </div>
    </div>
    <footer class="ftco-footer ftco-section bg-light">
		<div class="container">
			<div class="row d-flex">
				<div class="col-md">
					<div class="ftco-footer-widget mb-4">
						<h2 class="ftco-heading-2">Our Motto</h2>
						<p>Far far away, behind the word mountains, far from the
							countries Vokalia and Consonantia, there live the blind texts.</p>
						<ul class="ftco-footer-social list-unstyled float-lft mt-3">
							<li class="ftco-animate"><a href="#"><span
									class="icon-twitter"></span></a></li>
							<li class="ftco-animate"><a href="#"><span
									class="icon-facebook"></span></a></li>
							<li class="ftco-animate"><a href="#"><span
									class="icon-instagram"></span></a></li>
						</ul>
					</div>
				</div>
				<div class="col-md">
					<div class="ftco-footer-widget mb-4 ml-md-4">
						<h2 class="ftco-heading-2">Services</h2>
						<ul class="list-unstyled">
							<li><a href="#">Yoga class</a></li>
							<li><a href="#">Fitness class</a></li>
							<li><a href="#">Aerobic</a></li>
							<li><a href="#">Zumba class</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md">
					<div class="ftco-footer-widget mb-4">
						<h2 class="ftco-heading-2">Our objectives</h2>
						<ul class="list-unstyled">
							<li><a href="#">Inspiration</a></li>
							<li><a href="#">Encouragement</a></li>
							<li><a href="#">Wellness</a></li>
							<li><a href="#">Motivation</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md">
					<div class="ftco-footer-widget mb-4">
						<h2 class="ftco-heading-2">Have a Questions?</h2>
						<div class="block-23 mb-3">
							<ul>
								<li><span class="icon icon-map-marker"></span><span
									class="text">Detroit Michigan</span></li>
								<li><a href="#"><span class="icon icon-phone"></span><span
										class="text">+1 999 999 9999</span></a></li>
								<li><a href="#"><span class="icon icon-envelope"></span><span
										class="text">yvette@yuftiness.com</span></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</footer>
    <script src="js/jquery.min.js"></script>
	<script src="js/jquery-migrate-3.0.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/jquery.waypoints.min.js"></script>
	<script src="js/jquery.stellar.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/aos.js"></script>
	<script src="js/jquery.animateNumber.min.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/jquery.timepicker.min.js"></script>
	<script src="js/scrollax.min.js"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
	<script src="js/google-map.js"></script>
	<script src="js/main.js"></script>
</body>
</html>