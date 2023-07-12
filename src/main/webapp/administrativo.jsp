<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
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
		
		<title>Mantención de administrativo</title>
	</head>
	<body>
		<!-- Inicio Navbar -->
		<jsp:include page="menu.jsp"/>
		<!-- Fin Navbar -->
	
		<div class="mt-5 container">
			
			<h2 class="text-center">Formulario Administrativo</h2>
			
			<div class="row mt-5">
				<div class="col-4 offset-4">
				
				<form class="fondo-form" action="ServletCrudAdministrativo" method="post" id="form-create-administrativo">

					<div class="mb-3">
						<label for="area" class="form-label">Area</label>
						<input 
						type="text" 
						class="form-control" 
						id="area" 
						name="area"
						value="${administrativo.area}"
						/>
					</div>
					
					<div class="mb-3">
						<label for="aniosexperiencia" class="form-label">Años de Experiencia</label>
						<input
						type="text"
						class="form-control"
						id="aniosexperiencia"
						name="aniosexperiencia"
						value="${administrativo.aniosExperiencia}"
						/>
					</div>					
					
					<input type="hidden" name="option" value="updateAdministrativo">
					
					<div class="d-grid gap-2">
						<button type="submit" class="btn btn-primary">Enviar</button>
					</div>
					
				</form>
			</div>
		</div>
	</div>
	
	<!-- JS BootStrap -->
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
	<!-- JS BootStrap -->
	
	<!-- JQuery -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<!-- JQuery -->
	
</body>
</html>