package controlador.servlet.crud;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.implementacion.AdministrativoController;
import modelo.entity.Administrativo;

/**
 * Servlet implementation class ServletCrudAdministrativo
 */
@WebServlet("/ServletCrudAdministrativo")
public class ServletCrudAdministrativo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String option = request.getParameter("option"); 
		
		AdministrativoController administrativoController = new AdministrativoController();
	    String url = "login.jsp";
	    
	    switch (option) {
	    
	    	case "deleteAdministrativo": {
	    		int runDelete = Integer.parseInt(request.getParameter("run"));

	    		administrativoController.deleteAdministrativoByRun(runDelete);
	    		url = "listadousuarios.jsp";
	    		request.setAttribute("administrativos", administrativoController.findAllAdministrativos());
	    		break;
	    	}
	      
	    	case "formUpdateAdministrativo" : {

	    		int idFormAdministrativo = Integer.parseInt(request.getParameter("run"));

	    		Administrativo administrativo = administrativoController.findByRunAdministrativo(idFormAdministrativo);

	    		url = "administrativo.jsp";

	    		request.setAttribute("administrativo", administrativo);
	    		break;
	    	}
	      
	    	case "updateAdministrativo" : {

	    		int run = Integer.parseInt(request.getParameter("run"));
	    		String nombreUsuario = request.getParameter("nombreusuario");
	    		String fechaNacimiento = request.getParameter("fechanacimiento");
	    		String area = request.getParameter("area");
	    		String aniosExperiencia = request.getParameter("aniosexperiencia");
	        
	    		Administrativo updateAdministrativo = new Administrativo(
	    				nombreUsuario, fechaNacimiento, run, area, aniosExperiencia);
	    		
	    		administrativoController.updateAdministrativo(updateAdministrativo);
	    		url = "listadousuarios.jsp";
	    		request.setAttribute("administrativos", administrativoController.findAllAdministrativos());
	    		break;
	    	}

	    	case "saveAdministrativo" : {

	    		int run = Integer.parseInt(request.getParameter("run"));
	    		String nombreUsuario = request.getParameter("nombreusuario");
	    		String fechaNacimiento = request.getParameter("fechanacimiento");
	    		String area = request.getParameter("area");
	    		String aniosExperiencia = request.getParameter("aniosexperiencia");
	        
	    		Administrativo saveAdministrativo = new Administrativo(
	    				nombreUsuario, fechaNacimiento, run, area, aniosExperiencia);
	    		
	    		administrativoController.saveAdministrativo(saveAdministrativo);
	    		url = "crearadminstrativo.jsp";
	    		break;
	    	}

	    	default:
	    		break;
	        
	    }
	    // fin switch
	    request.getRequestDispatcher(url).forward(request, response);
	    
	  }
}
