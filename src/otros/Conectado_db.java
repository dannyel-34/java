/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otros;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIEL & JUAN
 * 
 * definicion:sistema de nomina de empleados, desarrollado para sistematizar el control de sus empleados,
 * Autores: Danie calle y Juan 
 */

public class Conectado_db {
    
    /*
    nombre de la db 
    */
    public String db = "bdnomina.sqlite";
    
    /*
    URL del driver db
    */
    public String url = "jdbc:sqlite:"+db;
    
    /*
    Usario de la bd
    */
    public String user = "root";
    
    /*
    constraseña del usuario db
    */
    public String password = "Admin123";
    
    /**
     * @exception lanza una excepcion en la conexion 
     * @return el objecto tipo connection 
     * 
     */
      public Connection Conectar(){

       Connection link = null;

       try{
           Class.forName("org.sqlite.JDBC");
           link = DriverManager.getConnection(this.url, this.user, this.password);
           
    
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
       }
       
       /**
        * @return devuelve el la direccion de la coexion a JDBC
        */
       return link;

   }
    
}
  