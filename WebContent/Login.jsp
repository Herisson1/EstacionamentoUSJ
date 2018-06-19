<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<!-- TAGS MATERIAL DESIGN -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Material Design for Bootstrap fonts and icons -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons">

<!-- Material Design for Bootstrap CSS -->
<link rel="stylesheet"
	href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css"
	integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX"
	crossorigin="anonymous">

<style>
body {
	margin: 50px;
	padding: 20px;
}
</style>

</head>
<body>

	<form>

		<div class="card">
			<div class="card-body">
				<div class="container">
					<p class="h4 text-center py-4">Login</p>

					<div class="form-group">
						<label for="email" class="bmd-label-floating">email: </label> <input
							type="text" class="form-control" id="email" required>
					</div>

					<div class="form-group">
						<label for="senha" class="bmd-label-floating">Senha: </label> <input
							type="password" class="form-control" id="placa" required>
					</div>



					<button type="submit" class="btn btn-info btn-raised">
						Cadastrar</button>
					<button type="submit" class="btn btn-success btn-raised">
						Entrar</button>
				</div>
			</div>
		</div>
	</form>

</body>
</html>