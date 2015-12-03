/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

/**
 *
 * @author Jojann_2
 */
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Arnold
 */
public class Probar {
    public static void main(String[] args)
    {
        Connection miConexion;
        miConexion= ConexionBD.GetConnection();
      
        if(miConexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }else
        {
             JOptionPane.showMessageDialog(null, "Algo esta fallando");   
        }
    }
}