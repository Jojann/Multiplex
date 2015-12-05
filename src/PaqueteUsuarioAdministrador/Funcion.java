/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteUsuarioAdministrador;

import ConexionSQLServer.ConexionSQLServer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Jojann_2
 */
public class Funcion {
    private Connection Conexion=null;
    
    public Funcion()
    {
        Conexion= ConexionSQLServer.GetConnection();
    }
    
    
    public ResultSet ListarFunciones()
    {
        ResultSet Listado=null;
        
        Statement EjecutarSentencia;
        
            try {
                
                EjecutarSentencia = Conexion.createStatement();
                String Consulta="Select * from Funcion JOIN pelicula ON funcion.id_funcion=pelicula.id_pelicula";
                //JOptionPane.showMessageDialog(null,Consulta);
                Listado= EjecutarSentencia.executeQuery(Consulta);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"FALLO SENTENCIA: "+ex);
            }
        
        
        return Listado;
    
    }
    
}
