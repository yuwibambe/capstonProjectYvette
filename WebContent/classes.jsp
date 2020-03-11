<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yu fitness</title>
</head>
<body>
	<%@ include file="./header.html"%>


	<section class="hero-wrap hero-wrap-2"
		style="background-image: url('img/1.jpg');"
		data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="container">
			<div
				class="row no-gutters slider-text js-fullheight align-items-center justify-content-center">
			</div>
		</div>
	</section>

	<div class="col-md-9 ftco-animate text-center">
		<h1 class="mb-3 bread">Class Program</h1>
		<p class="breadcrumbs">
			<span class="mr-2"><a href="index.html"></a></span> <span>Classes</span>
		</p>
	</div>
	<section class="ftco-section">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="classes w-100 ftco-animate">
						<a href="#" class="img w-100 mb-3"
							style="background-image: url(img/group.jpeg);"></a>
						<div class="text w-100 text-center">
							<h3>
								<a href="#">Private &amp; Group Lessons</a>
							</h3>
							<p>Sept. 30, 2019 - 01:00pm - 03:00pm</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="classes w-100 ftco-animate">
						<a href="#" class="img w-100 mb-3"
							style="background-image: url(img/classes-2.jpg);"></a>
						<div class="text w-100 text-center">
							<h3>
								<a href="#">Yoga for Pregnant</a>
							</h3>
							<p>Sept. 30, 2019 - 01:00pm - 03:00pm</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="classes w-100 ftco-animate">
						<a href="#" class="img w-100 mb-3"
							style="background-image: url(img/2.jpg);"></a>
						<div class="text w-100 text-center">
							<h3>
								<a href="#">Aerobic</a>
							</h3>
							<p>Sept. 30, 2019 - 01:00pm - 03:00pm</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="classes w-100 ftco-animate">
						<a href="#" class="img w-100 mb-3"
							style="background-image: url(img/a.jpeg);"></a>
						<div class="text w-100 text-center">
							<h3>
								<a href="#">fitness class</a>
							</h3>
							<p>Sept. 30, 2019 - 01:00pm - 03:00pm</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="classes w-100 ftco-animate">
						<a href="#" class="img w-100 mb-3"
							style="background-image: url(img/v.jpg);"></a>
						<div class="text w-100 text-center">
							<h3>
								<a href="#">Zumba class</a>
							</h3>
							<p>Sept. 30, 2019 - 01:00pm - 03:00pm</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="classes w-100 ftco-animate">
						<a href="#" class="img w-100 mb-3"
							style="background-image: url(img/4.jpeg);"></a>
						<div class="text w-100 text-center">
							<h3>
								<a href="#">Yoga Restore</a>
							</h3>
							<p>Sept. 30, 2019 - 01:00pm - 03:00pm</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<p>Available classes and workouts with trainer</p>
	<section class="d-flex justify-content-start" >
	<div class="input-group mr-4 " style="width:30%"> 
		<div class="input-group-prepend">
			<label class="input-group-text" for="inputGroupSelect01">Classes</label>
		</div>
		<select class="custom-select" id="inputGroupSelect01">
			<option selected>Available classes</option>
			<option value="1">Yoga class</option>
			<option value="2">Yoga for pregnant</option>
			<option value="3"></option>
		</select>
	</div>
	<div class="input-group mr-4 justify-content-center" style="width:30%"> 
		<div class="input-group-prepend">
			<label class="input-group-text" for="inputGroupSelect01">Workouts</label>
		</div>
		<select class="custom-select" id="inputGroupSelect01">
			<option selected>Available workout </option>
			<option value="1">push ups</option>
			<option value="2">Bench press</option>
			<option value="3"> shoulder press</option>
		</select>
	</div>
	<button type="button" class="btn btn-primary">Pick</button>
	</section>
	
	<br>
	<%@ include file="./footer.html"%>

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