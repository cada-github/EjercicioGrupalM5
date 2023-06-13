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
			
		<title>Servlet ListaCapacitaciones</title>
	</head>
	<body>
		<!-- Inicio Navbar -->
		<jsp:include page="menu.jsp"/>
		<!-- Fin Navbar -->
		
		<div class="mt-5 container">
			<div class="row">
				<div class="col-6 offset-3">
					
					<h2 class="text-center mb-5 text-bg-info">Lista Capacitaciones</h2>
								
					<table class="table table-striped table-hover">
						<thead class="table-dark">
						<tr>
							<th scope="col">Identificador</th>
							<th scope="col">Rut Cliente</th>
							<th scope="col">Día</th>
							<th scope="col">Hora</th>
							<th scope="col">Lugar</th>
							<th scope="col">Duración</th>
							<th scope="col">Cantidad asistentes</th>
						</tr>
						</thead>
					</table>
				</div>
				<a class="text-center mt-5" href="Inicio">Volver</a>
			</div>
		</div>	
	</body>
</html>