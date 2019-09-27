/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author FernANDO
 */
public class Controller_conexion {

    public static String url = "jdbc:mysql://localhost/LOGIN";
    public static String clase = "com.mysql.jdbc.Driver";
    public static String usuario = "root";
    public static String contraseña = "";
    

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            JOptionPane.showMessageDialog(null,"Conexion Establecida");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Conexion No Establecida");
        }
        return conexion;
    }

}
