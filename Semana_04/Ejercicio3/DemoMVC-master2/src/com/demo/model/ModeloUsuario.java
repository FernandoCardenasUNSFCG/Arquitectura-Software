/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.model;

import com.demo.model.entity.Usuario;

/**
 *
 * @author whiston
 */
public class ModeloUsuario extends Model {
    
    static public boolean logIn(Usuario user){
        boolean band= false;
        
        if(user.getId().compareTo("Fernando") == 0 &&
                user.getClave().compareTo("123456") == 0){
            band = true;
        }else{
            band = false;
        }
        
        return band;
    }
    static public boolean LogUp(Usuario user) {
        boolean band = false;
        if (user.getId().compareTo("070137996") == 0 && user.getClave().compareTo("1234") == 0 
                && user.getnClave().compareTo(user.getClave()) == 0 && user.getEmail().compareTo("cancer_nandito@hotmail.com") == 0 
                && user.getApellidos().compareTo("Cardenas") == 0 && user.getNombres().compareTo("Fernando") == 0) {
            band = true;
        } else {
            band = false;
        }
        return band;
    }

    static public boolean LogRecu(Usuario user) {
        boolean band = false;
        if (user.getId().compareTo("Fernando") == 0 && user.getClave().compareTo("123") == 0 && user.getnClave().compareTo(user.getClave()) == 0) {
            band = true;
        } else {
            band = false;
        }
        return band;
    }
    
}
