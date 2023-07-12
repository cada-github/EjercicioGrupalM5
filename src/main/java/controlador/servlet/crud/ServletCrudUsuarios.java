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

	    		int run = Integer.parseInt(request.getParameter("run"));
	    		String nombre  = request.getParameter("nombre");
	    		String fechaNacimiento  = request.getParameter("fechanacimiento");
	    		String tipo  = request.getParameter("tipo");
	    		
	    		Usuario updateUsuario = new Usuario(run,nombre,fechaNacimiento,tipo);
	    		
	    		usuarioController.updateUsuario(updateUsuario);
	    		
	    		url = "listadousuarios.jsp";
	    		request.setAttribute("usuarios", usuarioController.findAllUsuarios());
	    		break;
	    	}

	    	case "saveUsuario" : {
	    		
	    		int run = Integer.parseInt(request.getParameter("run"));
	    		String nombre  = request.getParameter("nombre");
	    		String fechaNacimiento  = request.getParameter("fechanacimiento");
	    		String tipo = request.getParameter("tipo");
	        
	    		Usuario saveUsuario = new Usuario(run, nombre,fechaNacimiento, tipo);
	    		
	    		usuarioController.saveUsuario(saveUsuario);
	    		
	    		switch (tipo) {
	    			case "cliente":
	    				url = "crearcliente.jsp";
	    				break;
	    			case "administrativo":
	    				url = "crearadministrativo.jsp";
	    				break;
	    			case "profesional":
	    				url = "crearprofesional.jsp";
	    				break;
	    			default:
	    				System.out.println("Ha ocurrido un error en el tipo de usuario");
	    		}
	    		request.setAttribute("tipo", tipo);
	    		break;
	    	}

	    	default:
	    		break;
	        
	    }
	    // fin switch
	    request.getRequestDispatcher(url).forward(request, response);
	    
	  }

}
