package controlador.servlet.crud;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.implementacion.ProfesionalController;
import modelo.entity.Profesional;

/**
 * Servlet implementation class ServletCrudProfesional
 */
@WebServlet("/ServletCrudProfesional")
public class ServletCrudProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String option = request.getParameter("option"); 
		
		ProfesionalController profesionalController = new ProfesionalController();
	    String url = "login.jsp";
	    
	    switch (option) {
	    
	    	case "deleteProfesional": {
	    		int runDelete = Integer.parseInt(request.getParameter("run"));

	    		profesionalController.deleteProfesionalByRun(runDelete);
	    		url = "listadousuarios.jsp";
	    		request.setAttribute("profesionales", profesionalController.findAllProfesionales());
	    		break;
	    	}
	      
	    	case "formUpdateProfesional" : {

	    		int idFormProfesional = Integer.parseInt(request.getParameter("run"));

	    		Profesional profesional = profesionalController.findByRunProfesional(idFormProfesional);

	    		url = "profesional.jsp";

	    		request.setAttribute("profesional", profesional);
	    		break;
	    	}
	      
	    	case "updateProfesional" : {

	    		int run = Integer.parseInt(request.getParameter("run"));
	    		String nombreUsuario = request.getParameter("nombreusuario");
	    		String fechaNacimiento = request.getParameter("fechanacimiento");
	    		String area = request.getParameter("area");
	    		String aniosExperiencia = request.getParameter("aniosexperiencia");
	        
	    		Profesional updateProfesional = new Profesional(
	    				nombreUsuario, fechaNacimiento, run, area, aniosExperiencia);
	    		
	    		profesionalController.updateProfesional(updateProfesional);
	    		url = "listadousuarios.jsp";
	    		request.setAttribute("profesionales", profesionalController.findAllProfesionales());
	    		break;
	    	}

	    	case "saveProfesional" : {

	    		int run = Integer.parseInt(request.getParameter("run"));
	    		String nombreUsuario = request.getParameter("nombreusuario");
	    		String fechaNacimiento = request.getParameter("fechanacimiento");
	    		String area = request.getParameter("area");
	    		String aniosExperiencia = request.getParameter("aniosexperiencia");
	        
	    		Profesional saveProfesional = new Profesional(
	    				nombreUsuario, fechaNacimiento, run, area, aniosExperiencia);
	    		
	    		profesionalController.saveProfesional(saveProfesional);
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
