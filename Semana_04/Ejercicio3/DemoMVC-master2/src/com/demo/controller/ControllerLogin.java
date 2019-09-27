/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.model.ModeloUsuario;
import com.demo.model.entity.Usuario;

/**
 *
 * @author whiston
 */
public class ControllerLogin extends Controller {
    
    public ControllerLogin(){
    
    }
    
    public boolean logIn(String usuario, String clave){
        boolean band = false;
        Usuario user = new Usuario(usuario, clave);
        band = ModeloUsuario.logIn(user);
        return band;
    }
    
    
    public boolean logUp(String id,String email, String clave, String nclave, String apellidos,String nombres){
        boolean band = false;
        Usuario user = new Usuario(id, email, clave, nclave, apellidos, nombres);
        band = ModeloUsuario.LogUp(user);
        return band;
    }
    
    public boolean RecuperarClave(String usuario, String clave ,String nclave){
        boolean band = false;
        Usuario user = new Usuario(usuario, clave, nclave);
        band = ModeloUsuario.LogRecu(user);
        return band;
    }
    
}
