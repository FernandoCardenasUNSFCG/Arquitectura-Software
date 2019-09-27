/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import java.sql.*;

/**
 *
 * @author FernANDO
 */
public class Controller_Metodos {

    public static Controller_conexion conexion = new Controller_conexion();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String usuario,String nombre, String apellido, String correo , String contraseña){
        int resultado=0;        
        Connection conexion=null;
        
        String sentencia_guardar=("INSERT INTO usuarios (usuario,nombre,apellido,correo,contraseña) VALUES(?,?,?,?,?)");
        
        try {
            conexion=Controller_conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, usuario);
            sentencia_preparada.setString(2, nombre);
            sentencia_preparada.setString(3, apellido);
            sentencia_preparada.setString(4, correo);
            sentencia_preparada.setString(5, contraseña);
            
            resultado=sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
        } catch (Exception e) {
            System.out.println(e);                   
        }
        return resultado;
    }
    
    public static String buscarNombre(String usuario){
        String busqueda_nombre=null;
        Connection conexion=null;
        try {
            conexion=Controller_conexion.conectar();
            String sentencia_buscar = ("SELECT nombre ,apellido , correo FROM usuarios WHERE usuario = '"+usuario+"'");
            sentencia_preparada=conexion.prepareStatement(sentencia_buscar);
            resultado=sentencia_preparada.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                busqueda_nombre = (nombre+ " " + apellido);
            }     
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);              
        }
        return busqueda_nombre;              
    }
    
    public static String buscarUsuarioRegistrado (String usuario , String contraseña){
        String busqueda_usuario=null;
        Connection conexion = null;
        try {
            conexion = Controller_conexion.conectar();
            String sentencia_buscar_usuario=("SELECT nombre,apellido,correo FROM usuarios WHERE usuario = '" + usuario + "' && contraseña = '" + contraseña+"'");
            sentencia_preparada=conexion.prepareStatement(sentencia_buscar_usuario);
            resultado=sentencia_preparada.executeQuery();
            if (resultado.next()) {
                busqueda_usuario = "Usuario encontrado";
                
            } else {
                busqueda_usuario = "Usuario no encontrado";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_usuario;
    }
}
