<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!--Bootstrap -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
		<!--Bootstrap -->
		
		<!-- Estilos propios -->
		<link href="css/estilos.css" rel="stylesheet" type="text/css">
		<!-- Estilos propios -->
		
		<title>Mantención de usuario</title>
	</head>
	<body>
		<!-- Inicio Navbar -->
		<jsp:include page="menu.jsp"/>
		<!-- Fin Navbar -->
	
		<div class="mt-5 container">
			
			<h2 class="text-center">Formulario Usuario</h2>
			
			<div class="row mt-5">
				<div class="col-4 offset-4">
				
				<form class="fondo-form" action="ServletCrudUsuarios" method="post" id="form-create-usuario">

					<div class="mb-3">
						<label for="run" class="form-label">Run</label>
						<input 
						type="number" 
						class="form-control" 
						id="run" 
						name="run"
						value="${usuario.runUsuario}"
						readonly
						/>
					</div>
				
					
					<div class="mb-3">
						<label for="nombre" class="form-label">Nombre</label>
						<input 
						type="text" 
						class="form-control" 
						id="nombre" 
						name="nombre"
						value="${usuario.nombreUsuario}"
						/>
					</div>
					
					<div class="mb-3">
						<label for="fechanacimiento" class="form-label">Fecha de Nacimiento</label>
						<input
						type="text"
						class="form-control"
						id="fechanacimiento"
						name="fechanacimiento"
						value="${usuario.fechaNacimientoUsuario}"
						/>
					</div>					
					
					<input type="hidden" name="option" value="updateUsuario">
					
					<div class="d-grid gap-2">
						<button type="submit" class="btn btn-primary">Enviar</button>
					</div>
					
				</form>
			</div>
		</div>
	</div>
	
		<!-- JS BootStrap -->
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	 integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" 
	 crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" 
	crossorigin="anonymous">
	</script>
	
	<!-- JQuery -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<!-- JQuery -->
	
	<!-- JS propios -->
	<script src="js/app.js"></script>
	<!-- JS propios -->
</body>
</html>