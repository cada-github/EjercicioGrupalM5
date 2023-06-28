package controlador.servlet.crud;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.implementacion.UsuarioController;
import modelo.entity.Usuario;

/**
 * Servlet implementation class ServletCrudUsuarios
 */
@WebServlet("/ServletCrudUsuarios")
public class ServletCrudUsuarios extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String option = request.getParameter("option"); 
		
	    UsuarioController usuarioController = new UsuarioController();
	    String url = "login.jsp";
	    
	    switch (option) {
	    
	    	case "deleteUsuario": {
	    		int runDelete = Integer.parseInt(request.getParameter("run"));

	    		usuarioController.deleteUsuarioByRun(runDelete);
	    		url = "listadousuarios.jsp";
	    		request.setAttribute("usuarios", usuarioController.findAllUsuarios());
	    		break;
	    	}
	      
	    	case "formUpdateUsuario" : {

	    		int runFormUsuario = Integer.parseInt(request.getParameter("run"));

	    		Usuario usuario = usuarioController.findByRunUsuario(runFormUsuario);

	    		url = "usuario.jsp";

	    		request.setAttribute("usuario", usuario);
	    		break;
	    	}
	      
	    	case "updateUsuario" : {

	    		String nombre  = request.getParameter("nombre");
	    		String fechaNacimiento  = request.getParameter("fechanacimiento");
	    		int run = Integer.parseInt(request.getParameter("run"));
	    		
	    		Usuario updateUsuario = new Usuario(nombre,fechaNacimiento,run);
	    		
	    		usuarioController.updateUsuario(updateUsuario);
	    		
	    		url = "listadousuarios.jsp";
	    		request.setAttribute("usuarios", usuarioController.findAllUsuarios());
	    		break;
	    	}

	    	case "saveUsuario" : {

	    		String nombre  = request.getParameter("nombre");
	    		String fechaNacimiento  = request.getParameter("fechanacimiento");
	    		int run = Integer.parseInt(request.getParameter("run"));
	        
	    		Usuario saveUsuario = new Usuario(nombre,fechaNacimiento,run);
	    		
	    		usuarioController.saveUsuario(saveUsuario);
	    		url = "crearusuario.jsp";
	    		break;
	    	}

	    	default:
	    		break;
	        
	    }
	    // fin switch
	    request.getRequestDispatcher(url).forward(request, response);
	    
	  }

}
