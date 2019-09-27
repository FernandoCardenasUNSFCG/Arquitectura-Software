/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.model.entity;

/**
 *
 * @author whiston
 */
public class Usuario {
    
    private String id;
    private String email;
    private String clave;
    private String nclave;
    private String apellidos;
    private String nombres;
    private int tipo;

    public Usuario() {
    }

    public Usuario(String id, String email, String clave, String apellidos, String nclave,String nombres, int tipo) {
        this.id = id;
        this.email = email;
        this.clave = clave;
        this.nclave=nclave;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.tipo = tipo;
    }
    
    public Usuario(String id, String email, String clave, String nclave, String apellidos, String nombres) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.nclave=nclave;
        this.email = email;    
    }

    public Usuario(String id, String clave) {
        this.id = id;
        this.clave = clave;
    }
    
    public Usuario(String id, String clave, String nclave) {
        this.id = id;
        this.clave = clave;
        this.nclave = nclave;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
     public String getnClave() {
        return nclave;
    }

    public void setnClave(String nclave) {
        this.nclave = nclave;
    }


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
