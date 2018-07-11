<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Ve�culos</title>

<!-- TAGS MATERIAL DESIGN -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Material Design for Bootstrap fonts and icons -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons">

    <!-- Material Design for Bootstrap CSS -->
    <link rel="stylesheet" href="https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css" integrity="sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX" crossorigin="anonymous"> 

<style>

 body {
  	margin: 50px;
  	padding: 20px;
 }

</style>

</head>
<body>

	<form method="Post" action="ListaVeiculos.jsp" >

		<div class="card">
			<div class="card-body">
				<div class="container">
					<p class="h4 text-center py-4">Cadastro de Ve�culos</p>
					
					<div class="form-group">
						<label for="motorista" class="bmd-label-floating">Motorista: </label>
						<input type="text" class="form-control" id="Motorista" name="sMotorista" required>
					</div>

					<div class="form-group">
						<label for="placa" class="bmd-label-floating">Placa: </label> 
						<input type="text" class="form-control" id="placa" name="sPlaca" required>
					</div>

					<div class="form-group">
						<label for="exampleSelect1" class="bmd-label-floating">Tipo de Ve�culo</label> 
						<select class="form-control" id="tipoVeiculo" name="sTipoVeiculo">
							<option>Motocicleta</option>
							<option>Autom�vel</option>
							<option>Micro�nibus</option>
							<option>�nibus</option>
							<option>Outros</option>
						</select>
					</div>

					<button type="reset" class="btn btn-secondary btn-raised">
						Limpar</button>
					<button type="submit" class="btn btn-success btn-raised" value="cadastrarVeiculo">
						Salvar</button>
					<button type="reset" class="btn btn-danger btn-raised" onClick="window.location.href='http://localhost:8080/Sistema_de_Estacionamento_USJ/Tela_Inicial.jsp'">
						Cancelar</button>
				</div>
			</div>
		</div>
	</form>

</body>
</html>