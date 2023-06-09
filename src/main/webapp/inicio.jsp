<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!-- Bootstrap -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
		<!-- Bootstrap -->
		<title>Login</title>
	</head>
<body>
	<div class="container mt-5">
		<h1 class="text-center">Inicie Sesión</h1>
		<div class="row mt-5">
			<div class="col-4 offset-4">
			
			<!-- Inicio Formulario -->
			<form action="Inicio" method="post">
			
				<!-- Nombre del usuario -->
				<div class="mb-3">
					<label for="usuario" class="form-label">Usuario</label>
					<input type="text" class="form-control" id="usuario" name="usuario" required />
				</div>
				
				<!-- Clave del usuario -->
				<div class="mb-3">
					<label for="password" class="form-label">Ingrese contraseña</label>
					<input type="text" class="form-control" id="password" name="password" required />
				</div>
				
				<!-- boton de envio -->
				<div class="d-grid gap-2">
					<button type="submit" class="btn btn-success">Enviar</button>
				</div>
				
			</form>
			<!-- Fin Formulario -->
			</div>
		</div>
	</div>
</body>
</html>