<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuários</title>

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

	<form method="post">

		<div class="card">
			<div class="card-body">
				<div class="container">
					<p class="h4 text-center py-4">Cadastro de Usuários</p>

					<div class="form-group">
						<label for="nome" class="bmd-label-floating">Nome: </label> <input
							type="text" class="form-control" id="nome" required value="${usuario.setNome()}">
					</div>

					<div class="form-group">
						<label for="cpf" class="bmd-label-floating">cpf: </label> <input
							type="text" class="form-control" id="cpf" required value="${usuario.setCpf()}">
					</div>

					<div class="form-group">
						<label for="email" class="bmd-label-floating">email: </label>
						 <input	type="text" class="form-control" id="email" required value="${usuario.setEmail()}">
					</div>
					
					<div class="form-group">
						<label for="senha" class="bmd-label-floating">Senha: </label> <input
							type="password" class="form-control" id="senha" required value="${usuario.setSenha()}">
					</div>


					<button type="reset" class="btn btn-secondary btn-raised">
						Limpar</button>
					<button type="submit" class="btn btn-success btn-raised">
						Salvar</button>
					<button type="button" class="btn btn-danger btn-raised"
						onClick="window.location.href='http://localhost:8080/Sistema_de_Estacionamento_USJ/Login.jsp'">
						Cancelar</button>
				</div>
			</div>
		</div>
	</form>

</body>
</html>