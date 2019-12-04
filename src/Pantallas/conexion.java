/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 20017181-0
 */
public class conexion 
{
    private static Connection cn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String contraseña="";
    private static final String url="jdbc:mysql://localhost:3306/mydb";

    public conexion() {
        cn=null;
        try
        {
            Class.forName(driver);
            cn=DriverManager.getConnection(url, user, contraseña);
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Error Clase");
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "La base de datos no esta activa, consulte con el administrador");
        }
    }
    
    public Connection getConnection()
    {
        return cn;
    }
}
