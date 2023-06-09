<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!--Bootstrap -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
		<!--Bootstrap -->		
		<title>Servlet Contacto</title>
	</head>
	<body>
	<div class="mt-5 container">
		<div class="row">
			<div class="col-6 offset-3">
				
				<h2 class="text-center mb-5 text-bg-info">Contacto</h2>
				
				<form action="Contacto" method="post">
					<div class="mb-3">
						<label for="nombre" class="form-label">Nombre</label>
						<input type="text" class="form-control" id="nombre" name="nombre" required>
					</div>
					<div class="mb-3">
						<label for="Telefono" class="form-label">Telefono</label>
						<input type="text" class="form-control" id="telefono" name="telefono" required>
					</div>
					<div class="mb-3">
						<label for="Email" class="form-label">Email</label>
						<input type="text" class="form-control" id="email" name="email">
					</div>
					<div class="form-floating mb-3">
					  <textarea class="form-control" placeholder="Escribe tu comentario aqui..." id="comentario" name="comentario"></textarea>
					  <label for="comentario">Comentarios</label>
					</div>
					
					<div class="d-grid gap-2">
						<button type="submit" class="btn btn-primary">Enviar</button>
					</div>
				</form>
				
			<div class="row">
				<h6 class="mb-1">Integrantes:</h6>
				<ul class="list-group">
					<li class="list-group-item list-group-item-primary">Nicolae Villegas</li>
					<li class="list-group-item list-group-item-primary">Fabiana Vega</li>
					<li class="list-group-item list-group-item-primary">Jesús Torres</li>
					<li class="list-group-item list-group-item-primary">Cristian Díaz</li>
				</ul>
				<p>
					<a class="link-opacity-100" href="https://github.com/cada-github/EjercicioGrupalM5.git">
					GitHub: Ejercicio Grupal M5
					</a>
				</p>
			</div>
			</div>
		</div>
	</div>	
	</body>
</html>