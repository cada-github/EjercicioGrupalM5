package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletIndex
 */
@WebServlet("/Inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inicio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		if (usuario.equals("admin") && password.equals("1234")) {
			System.out.println(usuario+" "+password+" "+"EL IF SALIO VERDADERO");
			getServletContext().getRequestDispatcher("/contacto.jsp").forward(request, response);
		}else {
			System.out.println(usuario+" "+password+" "+"EL IF SALIO FALSO");
			// request.getRequestDispatcher("inicio.jsp").forward(request, response);
		}
	}

}
