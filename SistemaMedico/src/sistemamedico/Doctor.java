/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamedico;

import java.time.LocalDate;

/**
 *
 * @author Eliot
 */
public class Doctor extends Persona {
    protected int regDoctor;
    protected String especialidad;

    public Doctor(int regDoctor, String especialidad, String usuario, String clave, String nombre, String apellido, String direccion, LocalDate fechaNac) {
        super(usuario, clave, nombre, apellido, direccion, fechaNac);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
    }

    public int getRegDoctor() {
        return regDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
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

    public void setRegDoctor(int regDoctor) {
        this.regDoctor = regDoctor;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
    public void recetar(){
    }
    public void agregarPlanNut(){    
    }
    public void imprimirReceta(){      
    }
    public void regitrarSecretaria(){       
    }
}
