<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Roboto:400,700"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!--  Header and Footer -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- / Header and Footer -->
<link rel="stylesheet" type="text/css" href="../styles/registration.css">
<link rel="stylesheet" type="text/css" href="../styles/global.css">
<script src="../scripts/scripts.js"></script>
<title>Regitration form</title>
</head>
<body>
	<%@ include file="./header.html"%>
	<section class="hero-wrap hero-wrap-2"
		style="background-image: url('img/3.jpg');"
		data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="container">
			<div
				class="row no-gutters slider-text js-fullheight align-items-center justify-content-center">
				<div class="col-md-9 ftco-animate text-center">
					<h1 class="mb-3 bread">Contact Us</h1>
					<p class="breadcrumbs">
						<span class="mr-2"><a href="index.html">Home</a></span> <span>Contact</span>
					</p>
				</div>
			</div>
		</div>
	</section>

	<div class="content container-fluid list">
		<div class="row">
			<div class="col-md-4 col-sm-4 col-xs-12"></div>
			<div class="col-md-4 col-sm-4 col-xs-12">
				<!-- <div class="signup-form"> -->
				<form class="form-container" action="AddMemberServlet" method="post">
					<h1>Create an Account</h1><br>
					<h3>Please fill in this form to create an account</h3><br>
					<div class="form-group">
						<div class="input-group">
							<input type="text" class="form-control" id="firstname"
								name="firstname" placeholder="First Name" required="required">
						</div>
					</div>
					<div class="form-group">
						<div class="input-group">
							<input type="text" class="form-control" id="lastname"
								name="lastname" placeholder="last name" required="required">
						</div>
					</div>
					<div class="form-group">
						<div class="input-group">
							<input type="text" class="form-control" id="username"
								name="username" placeholder="User name" required="required">
						</div>
					</div>
					<div class="form-group">
						<div class="input-group">
							<input type="password" class="form-control" id="password"
								name="password" placeholder="Password" required="required">
						</div>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Sign Up">
					</div>
				</form>
			</div>
		</div>
	</div>

	<%@ include file='footer.html'%>
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