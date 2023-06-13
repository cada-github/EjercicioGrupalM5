<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page session="true" %>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Asesor�as en Seguridad</a>
    <button class="navbar-toggler" type="button" 
    data-bs-toggle="collapse" 
    data-bs-target="#navbarSupportedContent" 
    aria-controls="navbarSupportedContent" 
    aria-expanded="false" 
    aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Inicio">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Capacitacion">Capacitaci�n</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="ListarCapacitaciones">Listar Capacitaciones</a>
        </li>
        <li class="nav-item">
          <form action="Logout" method="post">
          	<button class="btn btn-outline-danger type="submit">Cerrar sesi�n</button>
          </form>
        </li>
      </ul>
      
      <c:if test="${not empty sessionScope.usuario }">
      	<p class="mx-3">Bienvenido 
      	<span class="fw-bold text-capitalize">${sessionScope.usuario}</span>
      	</p>
      </c:if>
    </div>
    
  </div>
</nav>