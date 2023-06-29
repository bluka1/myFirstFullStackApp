<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>Login Page</title>
	</head>
	
	<body>
		<div class="container">
			<h1>Login</h1>
			
			<pre>${errorMessage}</pre>
			<form class="form" method="post">
				<div>
					<label>User name:</label>
					<input type="text" name="name" placeholder="username"/>
				</div>
				<div>
					<label>Password:</label>
					<input type="password" name="password" placeholder="password" />		
				</div>
				<input type="submit" value="Log In" />		
			</form>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>