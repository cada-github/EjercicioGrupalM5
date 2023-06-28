package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexion.DBConnection;
import modelo.entity.Usuario;

public class UsuarioService {

	DBConnection conexion = DBConnection.getInstance();
	
	public List<Usuario> findAllUsuarios(){
		
		List<Usuario> usuarios = new ArrayList<>();
		DBConnection conexion = DBConnection.getInstance();
	
		String sql = "SELECT * FROM usuarios";
		
		try {
			
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
		
			while(rs.next()) {
			
				String nombre = rs.getString("nombre");
				String fechaNacimiento = rs.getString("fecha_nacimiento");
				int run = rs.getInt("run");
			
				Usuario usuario = new Usuario(nombre, fechaNacimiento, run);
				usuarios.add(usuario);
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return usuarios;
	}
	
	public boolean deleteUsuarioByRun(int run) {
		
		DBConnection conexion = DBConnection.getInstance();
	    String sql = "DELETE FROM usuarios WHERE run = ?" ;
	    System.out.println("run: "+run);
	    try {
	    	
	    	PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
	    	statement.setInt(1, run);
	    	int rowsAffected = statement.executeUpdate();
	      
	    	return rowsAffected > 0;
	      
	    } catch (Exception e) {
	    	
	      System.out.println(e.getMessage());
	      return false;
	      
	    }
	     
	}
	
	public Usuario findByRunUsuario(int run) {
		
		Usuario usuario = null;
		String sql = "SELECT * FROM usuarios WHERE run = ?";
		    
		try {
			
			PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
		    statement.setInt(1, run);
		    ResultSet rs = statement.executeQuery();
		    	
		    if(rs.next()) {
		    	
		    	String nombre = rs.getString("nombre");
				String fechaNacimiento = rs.getString("fecha_nacimiento");
				
				usuario = new Usuario(nombre,fechaNacimiento,run);
		        
		    }
		    	
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		      
		}
		return usuario;
		    
	}

	  public Usuario updateUsuario(Usuario usuario) {
		  
		  String sql = "UPDATE usuarios SET nombre = ?, fecha_nacimiento = ? WHERE run = ?";
		    
		  try {
			  
			  PreparedStatement statement = conexion.getConnection().prepareStatement(sql);

			  statement.setString(1, usuario.getNombreUsuario());
			  statement.setString(2, usuario.getFechaNacimientoUsuario());
			  statement.setInt(3, usuario.getRunUsuario());
		    	
			  statement.executeUpdate();
		      
		    } catch (Exception e) {
		    	
		    	System.out.println(e.getMessage());
		    	
		    }
		    return usuario;
		  }

	  public Usuario saveUsuario(Usuario usuario) {
		  
		  DBConnection conexion = DBConnection.getInstance();
		  String sql = "INSERT INTO usuarios (nombre, fecha_nacimiento, run) "
		    		+ "VALUES ( ? , ?, ?)";
		  
		  try {
			  
			  PreparedStatement preparedStatement = conexion.getConnection().prepareStatement(sql);
			  preparedStatement.setString(1, usuario.getNombreUsuario());
			  preparedStatement.setString(2, usuario.getFechaNacimientoUsuario());
			  preparedStatement.setInt(3, usuario.getRunUsuario());
			  
			  preparedStatement.executeUpdate();
			  
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				
			}
		    return usuario;
		    
	  }
	  
}
