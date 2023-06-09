<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!--Bootstrap -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
		<!--Bootstrap -->
		<title>Servlet Capacitacion</title>
	</head>
<body>
	<div class="mt-5 container">
		<div class="row">
			<div class="col-6 offset-3">
				<h2 class="text-center mb-5 text-bg-info">Capacitación</h2>
				
				<form action="capacitacion" method="post">
					<div class="mb-3">
						<label for="idcapacitacion" class="form-label">Identificador</label>
						<input type="text" class="form-control" id="idcapacitacion" name="idcapacitacion" required>
					</div>
					<div class="mb-3">
						<label for="rutcliente" class="form-label">Rut Cliente</label>
						<input type="text" class="form-control" id="rutcliente" name="rutcliente" required>
					</div>
					<div class="mb-3">
						<label for="dia" class="form-label">Dia</label>
						<input type="text" class="form-control" id="dia" name="dia">
					</div>
					<div class="mb-3">
						<label for="hora" class="form-label">Hora</label>
						<input type="text" class="form-control" id="hora" name="hora">
					</div>
					<div class="mb-3">
						<label for="lugar" class="form-label">Lugar</label>
						<input type="text" class="form-control" id="lugar" name="lugar">
					</div>
					<div class="mb-3">
						<label for="duracion" class="form-label">Duración</label>
						<input type="text" class="form-control" id="duracion" name="duracion">
					</div>
					<div class="mb-3">
						<label for="cantidadasistentes" class="form-label">Cantidad de asistentes</label>
						<input type="text" class="form-control" id="cantidadasistentes" name="cantidadasistentes">
					</div>
					
					<div class="d-grid gap-2">
						<button type="submit" class="btn btn-primary">Enviar</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>