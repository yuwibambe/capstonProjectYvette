<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyGoal</title>
<meta charset="utf-8">
<link rel="icon" type="image/jpg" href="./image/images(2).jpg">
<meta name="viewport" content="width=device-width, initial-scale=1">
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
<link rel="stylesheet" type="text/css" href="./css/global.css">
<script src="./js/scripts.js"></script>
<!-- this is the script for the do task functionality -->
<script src=./js/table.js></script>
<style>

</style>

</head>
<body>
<%@ include file="./header.html"%>
	<div class=" container-fluid ">
		<div class="row">
			<div class="col-md-4 col-sm-4 col-sm-4-out col-xs-12"></div>
			<div class="col-md-4 col-sm-4 col-xs-12 col-sm-4-mid">
				<div class="form-container">
					<form>
						<h2>Set your goal, make it happen!</h2> <br><br>
						<div class="form-group">
						<div class="form-group">
							<div class="input-group">
								<label for="priority">Weight <br><select id="priority"
									name="priority" class="form-control"> 
										<option value="100-120" selected>100-120</option>
										<option value="120-140">120-140</option>
										<option value="140-160">140-160</option>
										<option value="160-180">160-180</option>
										<option value="180-200">180-200</option>
								</select>
								</label>
							</div>
						</div>
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-pencil"></i></span>
								<input type="text" id="activity" pattern="^[a-z ,.'-]+$"
									title="Enter a activity" class="form-control"
									placeholder="Action">
							</div>
						</div>
						<div class="form-group">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="fa fa-commenting"></i></span> <input type="text"
									id="description" pattern="^[a-z ,.'-]+$"
									title="Enter a description" class="form-control"
									placeholder="Description of Action">
							</div>
						</div>
						
						<div class="form-group">
							<input type="button" class="btn btn-block" onclick="appendRow()"
								value="Add">
						</div>
					</form>
					<br />
					<table id="todoTable" class="table table-striped">
						<thead>
							<th><span class="glyphicon glyphicon-check"></span></th>
							<th>Exercise</th>
							<th>Motive</th>
							<th>Weight</th>
							<th>Delete</th>
						</thead>
						<tbody>

						</tbody>
					</table>
				</div>
			</div>
			<div class="col-md-4 col-sm-4 col-sm-4-out col-xs-12"></div>
		</div>
		<div class="header-right">
			<a href="./WelcomePage.jsp" class="btn btn-warning btn-lg"> <span
				class="log-out"></span> Log Out
			</a>
		</div>
	</div>
	<footer class="footer"> Copyright 2010 @ Yu fitness </footer>
</body>
</html>
   