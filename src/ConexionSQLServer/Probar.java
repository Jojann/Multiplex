/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSQLServer;
/**
 *
 * @author Jojann_2
 */
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Probar {
    public static void main(String[] args)
    {
        Connection miConexion;
        miConexion= ConexionSQLServer.GetConnection();
      
        if(miConexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }else
        {
             JOptionPane.showMessageDialog(null, "Algo esta fallando");   
        }
    }
}