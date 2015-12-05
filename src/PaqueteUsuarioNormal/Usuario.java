/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteUsuarioNormal;
import java.sql.Connection;
import ConexionSQLServer.ConexionSQLServer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Jojann_2
 */
public class Usuario {
    
    private Connection Conexion=null;
    
    private Integer Id_Usuario;
    private String NombreUsuario;
    private String Nombre;
    private String Apellido;
    private String Celular;
    
    public Usuario()
    {
        Conexion= ConexionSQLServer.GetConnection();
    }
    
    public boolean Validar(String user, String pw)
    {   
        
        if(Conexion!=null)
        {   
            Statement EjecutarSentencia;
            try {
                
                EjecutarSentencia = Conexion.createStatement();
                String Consulta="SELECT * FROM usuario WHERE usuario = '"+user.trim()+"' AND password='"+pw+"'";
                ResultSet Respuesta= EjecutarSentencia.executeQuery(Consulta);
                
                if(Respuesta.next())
                {   
                    Id_Usuario=Respuesta.getInt("id_usuario");
                    NombreUsuario=Respuesta.getString("usuario");
                    Nombre=Respuesta.getString("Nombre");
                    Apellido=Respuesta.getString("apellido");
                    Celular=Respuesta.getString("celular");
                    
                    return true;
                    
                }else
                {
                   return false;
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"FALLO SENTENCIA: "+ex);
            }
         
        }else
        {
            JOptionPane.showMessageDialog(null,"FALLO CONEXION A LA BASE DE DATOS");
        }

            return true;
    }
    
    
    public String getNombreUsuario()
    {
    
        return NombreUsuario;
    }
    
    public ResultSet ListadoReservasUsuario()
    {
        ResultSet Listado=null;
        
        Statement EjecutarSentencia;
        
            try {
                
                EjecutarSentencia = Conexion.createStatement();
                String Consulta="Select * from (Select id_pelicula,id_reserva,funcion.id_funcion,id_cliente,numero_tiquetes,valor,id_sala,hora_inicio,hora_fin,fecha,valor_total from Reserva join funcion on reserva.id_funcion=Funcion.id_funcion where id_cliente='"+Id_Usuario+"' and estado_reserva=1) as p join pelicula on p.id_pelicula=pelicula.id_pelicula";
                //JOptionPane.showMessageDialog(null,Consulta);
                Listado= EjecutarSentencia.executeQuery(Consulta);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"FALLO SENTENCIA: "+ex);
            }
        
        
        return Listado;
    }
    
}


