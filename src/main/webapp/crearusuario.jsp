<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!--Bootstrap -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
		<!--Bootstrap -->		
		<title>crear usuario</title>
	</head>
	<body>
	
	<!-- Inicio Navbar -->
	<jsp:include page="menu.jsp"/>
	<!-- Fin Navbar -->
	
	<div class="mt-5 container">
		<div class="row">
			<div class="col-6 offset-3">
				
				<h2 class="text-center mb-5 text-bg-info">Nuevo Usuario</h2>
				
				<form action="CrearUsuario" method="post">
					<div class="mb-3">
						<label for="nombre" class="form-label">Nombre</label>
						<input type="text" class="form-control" id="nombre" name="nombre" required>
					</div>
					<div class="mb-3">
						<label for="fechanacimiento" class="form-label">Fecha de Nacimiento</label>
						<input type="text" class="form-control" id="fechanacimiento" name="fechanacimiento" required>
					</div>
					<div class="mb-3">
						<label for="run" class="form-label">Run</label>
						<input type="text" class="form-control" id="run" name="run">
					</div>
					<div class="d-grid gap-2">
						<button type="submit" class="btn btn-primary">Enviar</button>
					</div>
				</form>				
			</div>
			<a class="text-center mt-5" href="Inicio">Volver</a>
		</div>
	</div>
	<!-- JS BootStrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" 
	crossorigin="anonymous">
	</script>
	<!-- JS BootStrap -->	
	</body>
</html>