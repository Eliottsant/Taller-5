/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import ec.edu.espol.model.Persona;
import java.time.LocalDate;

/**
 *
 * @author Eliot
 */
public class Secretaria extends Persona{

    public Secretaria(String usuario, String clave, String nombre, String apellido, String direccion, LocalDate fechaNac) {
        super(usuario, clave, nombre, apellido, direccion, fechaNac);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    public void verificarCita(){
        
    }
    public void agendarCta(){
    }
}
