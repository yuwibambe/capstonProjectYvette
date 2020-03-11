<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<style>
.purple-border textarea {
	border: 1px solid #ba68c8;
}
</style>
<meta charset="ISO-8859-1">
<title>Goal</title>
</head>

<body>
	<%@ include file="header.html"%>
	<section class="hero-wrap hero-wrap-2"
		style="background-image: url('img/3.jpg');"
		data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="container">
			<div
				class="row no-gutters slider-text js-fullheight align-items-center justify-content-center">
				<div class="col-md-9 ftco-animate text-center">
					
				</div>
			</div>
		</div>
	</section>
	<br>				
	<section class="ftco-section contact-section ftco-no-pt ftco-no-pb">

		<div class="container-fluid">
			<div class="col-md-6 mx-auto px-auto">
				<form class="form-container" action="GoalModelServlet" method="post">
					<h1>My Goal</h1>
					Your Weight: <input type="text" name="weightNum"><br>
					<br>Your Calorie: <input type="text" name="calorieNum"><br>
					<br> Workout Description: <input type="text"
						name="workoutDesc"><br> <br>your goal: <br>
					<textarea rows="4" cols="50" type="text" name="goal">
                        Enter text here...</textarea>
					<br> <br> <input type="submit">
				</form>
			</div>
			<div class="col-md-6">
				<table class="table">
					<tr>
						<th>Weight</th>
						<th>Calorie count</th>
						<th>Workout</th>
						<th>goal</th>
					</tr>
					<c:forEach items="${GoalList}" var="item">
						<tr>
							<td><c:out value="${item.weight}"></c:out></td>
							<td><c:out value="${item.caloriNum}"></c:out></td>
							<td><c:out value="${item.workoutDesc}"></c:out></td>
							<td><c:out value="${item.goalDesc}"></c:out></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</section>

	<%@ include file="footer.html"%>
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