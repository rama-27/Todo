<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
	
		<title>login Page</title>
	</head>
	<body>
		<div class="container">
		<h1>Login</h1>
		<form method="post">
				Username: <input type="text" name="username">
				password: <input type="password" name="password">
				<input type="submit">
			</form>			
			<pre>${errormsg}</pre>
		</div>
		<script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
	
	</body>
</html>