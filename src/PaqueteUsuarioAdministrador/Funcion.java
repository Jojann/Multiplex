/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteUsuarioAdministrador;

import ConexionSQLServer.ConexionSQLServer;
import java.sql.Connection;

/**
 *
 * @author Jojann_2
 */
public class Funcion {
    private Connection Conexion=null;
    Funcion()
    {
        Conexion= ConexionSQLServer.GetConnection();
    }
    
}
