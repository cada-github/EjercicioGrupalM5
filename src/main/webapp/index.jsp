<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		
		<!-- BootStrap -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
		<!-- BootStrap -->
		
		<title>Ejecicio Grupal Módulo 5</title>
	</head>
	<body>
		<div class="mt-5 container">
			<div class="row">
				<!-- Titulo formulario contacto -->
				<div class="col-6 offset-3">
					<h2 class="text-center mb-5">Formulario de Contacto</h2>
				<!-- Titulo formulario contacto -->

					<!-- Formulario contacto -->
					<form action="Contacto" method="post">

						<!-- Nombre del contacto -->
						<div class="mb-3">
							<label for="nombre" class="form-label">Nombre</label>
							<input type="text" class="form-control" id="nombre" name="nombre" required>
						</div>

						<!-- Telefono -->
						<div class="mb-3">
							<label for="telefono" class="form-label">Telefono</label>
							<input type="text" class="form-control" id="telefono" name="telefono" required>
						</div>

						<!-- Correo electrónico -->
						<div class="mb-3">
							<label for="correoelectronico" class="form-label">Correo Electrónico</label>
							<input type="text" class="form-control" id="correoelectronico" name="correoelectronico" required>
						</div>
						
						<div class="d-grid gap-2">
							<button type="submit" class="btn btn-primary">Enviar</button>
						</div>
						
					</form>
					<!-- Fin Formulario contacto -->
					
					
				</div>
			</div>
		</div>
	</body>
</html>