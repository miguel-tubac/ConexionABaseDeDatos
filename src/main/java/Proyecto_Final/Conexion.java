/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Final;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class Conexion {
  Connection con= null;
  public Connection Conexion(){
       try{
           Class.forName("org.sqlite.JDBC");
           String url = "jdbc:sqlite:C://Users//DELL//OneDrive//Escritorio//SQlite//Practico_1.db";
           con = DriverManager.getConnection(url);
           
         //JOptionPane.showMessageDialog(rootPane,"CONEXION EXITOSA");
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            
          //JOptionPane.showMessageDialog(rootPane,e);
        }
    return con;
  }
 public void conexion_Cerrar()throws SQLException{
    con.close();
  }
}
