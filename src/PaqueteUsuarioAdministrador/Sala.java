/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteUsuarioAdministrador;

import java.sql.Connection;
import ConexionSQLServer.ConexionSQLServer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author eduartandres
 */
public class Sala {
    private Connection Conexion=null;

 public Sala()
{
    Conexion= ConexionSQLServer.GetConnection(); 
}


public String InsertSala(String id_sala,String puestos, String nombre_sala){
     
    String respuesta=null;
      if(Conexion!=null)
        {   
            Statement EjecutarSentencia;
            try {
                
                EjecutarSentencia = Conexion.createStatement();
                String Consulta="INSERT INTO sala (id_sala,puestos,nombre_sala,cupos_disponibles,estado) VALUES ('"+id_sala+"','"+puestos+"','"+nombre_sala+"','"+puestos+"','0')";
                 EjecutarSentencia.executeUpdate(Consulta);
                                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"FALLO SENTENCIA: "+ex);
            }
         
        }else
        {
            JOptionPane.showMessageDialog(null,"FALLO CONEXION A LA BASE DE DATOS");
        }
      return respuesta;
  
}
}

